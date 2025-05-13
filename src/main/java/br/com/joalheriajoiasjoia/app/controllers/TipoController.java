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

import br.com.joalheriajoiasjoia.app.entities.Tipo;
import br.com.joalheriajoiasjoia.app.services.TipoService;

@RestController
@RequestMapping("/tipos")
public abstract class TipoController {

	//ATRIBUTOS
	@Autowired
	private TipoService tipoService;
	
	//criar novo tipo
	@PostMapping
	public Tipo createTipo(@RequestBody Tipo tipo) {
		return tipoService.saveTipo(tipo);
	}
	// Listar todos os tipos
	@GetMapping
	public List<Tipo> getAllTipos(){
		return tipoService.getAllTipos();
	}
	// Buscar por id
	@GetMapping("{/id}")
	public Tipo getTipoById(@PathVariable Long id) {
		return tipoService.getTipoById(id);
	}
	// Deletar um tipo
	@DeleteMapping("{/id}")
	public void deleteTipo(@PathVariable Long id) {
		tipoService.deleteTipoById(id);
	}
}
