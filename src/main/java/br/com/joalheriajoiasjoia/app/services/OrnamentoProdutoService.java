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
    
    // Salva um novo OrnamentoProduto
    public OrnamentoProduto saveOrnamentoProduto( OrnamentoProduto ornamentoProduto) {
        return ornamentoProdutoRepository.save(ornamentoProduto);
    }
    
    // Busca todos os OrnamentosProdutos
    public List<OrnamentoProduto> getAllOrnamentoProduto(){
        return ornamentoProdutoRepository.findAll();
    }
    
    //Busca por id
    public OrnamentoProduto getOrnamentoProdutoById (Long id) {
        return ornamentoProdutoRepository.findById(id).orElse(null);
    }
    // Deleta um OrnamentoProduto
    public void deleteOrnamentoProduto(Long id) {
        ornamentoProdutoRepository.deleteById(id);
    }
}