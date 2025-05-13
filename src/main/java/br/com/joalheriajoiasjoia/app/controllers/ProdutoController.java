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

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.services.ProdutoService;

@RestController
@RequestMapping("/cadastroproduto")
public class ProdutoController {

	
	@Autowired
	private ProdutoService produtoService;
	
	//MÉTODOS
	@PostMapping
	//Criar um novo produto
	public Produto createProduto(@RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}
	// Listar todos os produtos
	@GetMapping
	public List<Produto> getAllProdutos() {
		return produtoService.getAllProdutos();
	}
	// Buscar por id
	@GetMapping("/{id}")
	public Produto getProdutoById(@PathVariable Long id) {
		return produtoService.getProdutoById(id);
	}
	// Excluir um produto
	@DeleteMapping("/{id}")
	public void deleteProduto(Long id) {
		produtoService.deleteProduto(id);
	}
}
