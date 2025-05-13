package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	//ATRIBUTOS
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	//MÉTODOS
	//método para salvar um endereço
	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	//método para listar todos os endereços
	public List<Endereco> getAllEnderecos(){
		return enderecoRepository.findAll();
	}
	
	//método para buscar o endereço pelo cep
	public Endereco getEnderecoByCep (String cep) {
		return enderecoRepository.findByCep(cep);
	}
	
	//método para deletar um endereço
	public void deleteEndereco(Long id) {
		enderecoRepository.deleteById(id);
	}
}
