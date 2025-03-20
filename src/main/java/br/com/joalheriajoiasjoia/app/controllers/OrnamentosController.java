package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Ornamentos;
import br.com.joalheriajoiasjoia.app.services.OrnamentosService;

@RestController
@RequestMapping("/ornamentos")
public class OrnamentosController {

	//ATRIBUTOS
	@Autowired
	private OrnamentosService ornamentoService;
	
	//MÉTODOS
	@PostMapping
	public Ornamentos createOrnamento(@RequestBody Ornamentos ornamento) {
		return ornamentoService.saveOrnamento(ornamento);
	}
	
	@GetMapping
	public List<Ornamentos> getAllOrnamentos() {
		return ornamentoService.getAllOrnamentos();
	}
	
	@GetMapping("/{id}")
	public Ornamentos getOrnamentoById(Long id) {
		return ornamentoService.getOrnamentoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteOrnamento(Long id) {
		ornamentoService.deleteOrnamento(id);
	}
}

