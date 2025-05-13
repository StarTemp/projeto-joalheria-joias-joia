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
	
	//Salvar um novo produto
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	// Buscar todos os produtos
	public List<Produto> getAllProdutos(){
		return produtoRepository.findAll();
	}
	// Buscar produto por id
	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	// Deletar produto
	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}
}
