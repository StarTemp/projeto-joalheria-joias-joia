package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	//ATRIBUTOS
	@Autowired
	private ProdutoRepository produtoRepository;
	
	//MÉTODOS
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public List<Produto> getAllProdutos(){
		return produtoRepository.findAll();
	}
	
	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}
