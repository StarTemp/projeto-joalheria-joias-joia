package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.services.UsuarioService;

@RestController
@RequestMapping("/cadastrocliente")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	// Criar novo usuario
	@PostMapping
	public Usuario createCliente(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	// Listar os Usuarios
	@GetMapping
	public List<Usuario> getAllUsuarios() {
		return usuarioService.getAllUsuarios();
	}

	// Buscar por id
	@GetMapping("/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		return usuarioService.getUsuarioById(id);
	}

	// Atualiza o Usuario
	@PutMapping
	public Usuario editUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	// Deleta um usuario
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		usuarioService.deleteUsuario(id);
	}

	// Busca Usuario por cpf
	@GetMapping("/{cpf}")
	public Usuario getUsuarioByCpf(@PathVariable String cpf) {
		return usuarioService.getUsuarioByCpf(cpf);
	}

	@PostMapping("/login")
	public Usuario login(@RequestBody Usuario loginRequest) {// request body cria uma requisição, o loginRequest
																// armazena os valores do email e da senha recebidos do
																// front
		// Objeto para armazenar o resultado da autenticação no service (pessoa ou null)
		// Chama o método de autenticação do service passando o email e senha fornecidos
		// no login
		// 1. loginRequest.getEmail() - obtem o email enviado pelo usuário na requisição
		// 2. loginRequest.getSenha() - obtem a senha enviada pelo usuário na requisição
		// 3. usuarioService.autenticarPessoa(email, senha) - verifica no banco se
		// existe um usuário com esse email e se a senha é válida
		// 4. retorna o objeto usuário autenticado ou null, caso falha na autenticação
		Usuario pessoa = usuarioService.autenticar(loginRequest.getEmail(), loginRequest.getSenha());

		// Verifica se o service retornou um usuário válido (autenticação bem-sucedida)
		if (pessoa != null) {
			// Se autenticado, retorna os dados do usuário
			return pessoa;
		} else {
			// Se não autenticado, retorna null indicando falha no login
			return null;
		}
	}

}
