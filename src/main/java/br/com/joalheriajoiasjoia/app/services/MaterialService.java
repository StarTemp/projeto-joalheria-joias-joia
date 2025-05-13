package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Material;
import br.com.joalheriajoiasjoia.app.repositories.MaterialRepository;

@Service
public class MaterialService {

	//ATRIBUTOS
	@Autowired
	private MaterialRepository materialRepository;
	
	//MÉTODOS
	//método para salvar um material
	public Material saveMaterial(Material material) {
		return materialRepository.save(material);
	}
	
	//método para listar todos os materiais
	public List<Material> getAllMateriais(){
		return materialRepository.findAll();
	}
	
	//métodos para buscar o material pelo id
	public Material getMaterialById(Long id) {
		return materialRepository.findById(id).orElse(null);
	}
	
	//método para deletar um material
	public void deleteMaterial(Long id) {
		materialRepository.deleteById(id);
	}
}
