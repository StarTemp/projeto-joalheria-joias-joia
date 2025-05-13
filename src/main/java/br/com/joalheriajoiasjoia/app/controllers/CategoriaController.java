package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Categoria;
import br.com.joalheriajoiasjoia.app.services.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	//ATRIBUTOS
	@Autowired
	private CategoriaService categoriaService;
	
	//MÉTODOS
	//método para postar/salvar uma categoria
	@PostMapping
	public Categoria createCategoria(@RequestBody Categoria categoria) {
		return categoriaService.saveCategoria(categoria);
	}
	
	//método para listar todas as categorias
	@GetMapping
	public List<Categoria> getAllCategorias() {
		return categoriaService.getAllCategorias();
	}
	
	//método para buscar a categoria pelo id
	@GetMapping("/{id}")
	public Categoria getCategoriaById(Long id) {
		return categoriaService.getCategoriaById(id);
	}
	
	//método para deletar uma categoria
	@DeleteMapping("/{id}")
	public void deleteCategoria(Long id) {
		categoriaService.deleteCategoria(id);
	}
}
