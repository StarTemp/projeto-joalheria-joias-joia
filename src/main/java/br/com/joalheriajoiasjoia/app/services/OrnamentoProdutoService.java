package br.com.joalheriajoiasjoia.app.services;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.OrnamentoProduto;
import br.com.joalheriajoiasjoia.app.repositories.OrnamentoProdutoRepository;

@Service
public class OrnamentoProdutoService {
    @Autowired
    private OrnamentoProdutoRepository ornamentoProdutoRepository;
    
    public OrnamentoProduto saveOrnamentoProduto( OrnamentoProduto ornamentoProduto) {
        return ornamentoProdutoRepository.save(ornamentoProduto);
    }
    
    public List<OrnamentoProduto> getAllOrnamentoProduto(){
        return ornamentoProdutoRepository.findAll();
    }
    
    public OrnamentoProduto getOrnamentoProdutoById (Long id) {
        return ornamentoProdutoRepository.findById(id).orElse(null);
    }
    
    public void deleteOrnamentoProduto(Long id) {
        ornamentoProdutoRepository.deleteById(id);
    }
}