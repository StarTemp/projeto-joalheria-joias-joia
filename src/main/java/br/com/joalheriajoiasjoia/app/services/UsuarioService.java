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
	 // buscar pessoa por email
    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
	// verificar email e senha
    public Usuario autenticarPessoa(String email, String senha) {
        //verificar existencia de email
        Usuario pessoa = usuarioRepository.findByEmail(email);
        
        if(pessoa != null && pessoa.getSenha().equals(senha)){
         return pessoa;
        }
        else {
            return null;
        }
    }
    
    
    

}
