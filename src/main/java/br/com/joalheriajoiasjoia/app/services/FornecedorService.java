package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Fornecedor;
import br.com.joalheriajoiasjoia.app.repositories.FornecedorRepository;

@Service
public class FornecedorService {

	//ATRIBUTOS
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	//MÉTODOS
	//método para salvar um fornecedor
	public Fornecedor saveFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	
	//método para listar todos os fornecedores
	public List<Fornecedor> getAllFornecedores(){
		return fornecedorRepository.findAll();
	}
	
	//método para buscar um fornecedor pelo id
	public Fornecedor getFornecedorById(Long id) {
		return fornecedorRepository.findById(id).orElse(null);
	}
	
	//método para deletar um fornecedor
	public void deleteFornecedor(Long id) {
		fornecedorRepository.deleteById(id);
	}
}
