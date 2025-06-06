package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Categoria;
import br.com.joalheriajoiasjoia.app.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	//ATRIBUTOS
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	//MÉTODOS
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public List<Categoria> getAllCategorias(){
		return categoriaRepository.findAll();
	}
	
	public Categoria getCategoriaById(Long id) {
		return categoriaRepository.findById(id).orElse(null);
	}
	
	public void deleteCategoria(Long id) {
		categoriaRepository.deleteById(id);
	}
	
	
}
