package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.repositories.UsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	// Salva um novo Usuario
	public Usuario saveUsuario( Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	// Busca todos os Usuarios
	public List<Usuario> getAllUsuarios(){
		return usuarioRepository.findAll();
	}
	// Busca por id
	public Usuario getUsuarioById (Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	// Deleta um Usuario
	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
     // Buscar  Usuario por cpf
	public Usuario getUsuarioByCpf(String cpf) {
		return usuarioRepository.findByCpf(cpf);
	}
	
    
public Usuario autenticar(String email, String senha) {//os parâmetros armazenam os valores de email e senha
		
		//Objeto para buscar no banco de dados o usuário que tenha o email informado (ver se existe)
		Usuario pessoa = usuarioRepository.findByEmail(email);//se existir, tem uma senha ligada a ele (o objeto armazena TUDO do usuário)
		
		//Verifica se o usuário foi encontrado e se a senha informada confere com a senha do usuário
		if(pessoa != null && pessoa.getSenha().equals(senha)) {//em outras palavras: verifica se não é nulo e se a senha do banco de dados (que está salvo no objeto pessoa) é igual a senha recebida do front
			//se email e senha estiverem corretos, retorna o objeto usuário autenticado
			return pessoa;
		} else {
			//se o usuário não existir ou a senha não estiver correta, retorna null (falha na autenticação)
			return null;
		}
	}
    }
    
    
    


