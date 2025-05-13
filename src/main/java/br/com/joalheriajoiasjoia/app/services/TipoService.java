package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Tipo;
import br.com.joalheriajoiasjoia.app.repositories.TipoRepository;

@Service
public class TipoService {

	//ATRIBUTOS
	@Autowired
	private TipoRepository tipoRepository;
	
	//salvar um novo tipo
	public Tipo saveTipo(Tipo tipo) {
		return tipoRepository.save(tipo);
	}
	// buscar todos os tipos
	public List<Tipo> getAllTipos(){
		return tipoRepository.findAll();
	}
	//buscar tipo por id
	public Tipo getTipoById(Long id) {
		return tipoRepository.findById(id).orElse(null);
	}
	//deletar tipo
	public void deleteTipoById(Long id) {
		tipoRepository.deleteById(id);
	}
}
