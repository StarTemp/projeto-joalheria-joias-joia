package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.services.EnderecoService;

@RestController
@RequestMapping("/cadastroenderecos")
public class EnderecoController {

	//ATRIBUTOS
	@Autowired
	private EnderecoService enderecoService;
	
	//MÉTODOS
	//método para postar/salvar um endereço
	@PostMapping
	public Endereco createEndereco(@RequestBody Endereco endereco) {
		return enderecoService.saveEndereco(endereco);
	}
	
	//método para listar todos os endereços
	@GetMapping
	public List<Endereco> getAllEnderecos(){
		return enderecoService.getAllEnderecos();
	}
	
	//métodos para buscar o endereço pelo cep
	@GetMapping("/{cep}")
	public Endereco getEndereco(@PathVariable String cep) {
		return enderecoService.getEnderecoByCep(cep);
	}
	
	//método para deletar um endereço
	@DeleteMapping("/{id}")
	public void deleteEndereco(@PathVariable Long id) {
		enderecoService.deleteEndereco(id);
	}
}
