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

	//Criar novo usuario
	@PostMapping
	public Usuario createCliente(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}
    //Listar os Usuarios
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
	// Buscar pessoa por email
    @GetMapping("/email/{email}")
    public Usuario buscarPorEmail(@PathVariable String email) {
        return usuarioService.buscarPorEmail(email);
    }
    
    // Metodo de login
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario loginRequest) {
        
        //chama o serviço para verificar as credenciais
        Usuario pessoa = usuarioService.autenticarPessoa(loginRequest.getEmail(), loginRequest.getSenha());
        
        if(pessoa != null ) {
            return pessoa;
        }
        else {
            return null;
        }
    }


}
