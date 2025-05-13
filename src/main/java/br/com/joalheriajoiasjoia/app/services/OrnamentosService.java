package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Ornamentos;
import br.com.joalheriajoiasjoia.app.repositories.OrnamentosRepository;


@Service
public class OrnamentosService {

	//ATRIBUTOS
	@Autowired
	private OrnamentosRepository ornamentosRepository;
	
	//Salva um novo Ornamento
	public Ornamentos saveOrnamento(Ornamentos ornamento) {
		return ornamentosRepository.save(ornamento);
	}
	//Busca todos os Ornamentos
	public List<Ornamentos> getAllOrnamentos(){
		return ornamentosRepository.findAll();
	}
	// Busca por id
	public Ornamentos getOrnamentoById(Long id) {
		return ornamentosRepository.findById(id).orElse(null);
	}
	//Deleta um Ornamento
	public void deleteOrnamento(Long id) {
		ornamentosRepository.deleteById(id);
	}
	
}