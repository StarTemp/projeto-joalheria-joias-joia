package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.CupomDesconto;
import br.com.joalheriajoiasjoia.app.repositories.CupomDescontoRepository;

@Service
public class CupomDescontoService {

	//ATRIBUTOS
    @Autowired
    private CupomDescontoRepository cupomRepository;
    
    //ATRIBUTOS
    //método para salvar um cupom
    public CupomDesconto saveCupom(CupomDesconto cupom) {
        return cupomRepository.save(cupom);
    }
    
    //método para listar todos os cupons
    public List<CupomDesconto> getAllCupom(){
        return cupomRepository.findAll();
    }
    
    //método para buscar um cupom pelo id
    public CupomDesconto getCupomById (Long id) {
        return cupomRepository.findById(id).orElse(null);
    }
    
    //método para deletar um cupom
    public void deleteCupom(Long id) {
        cupomRepository.deleteById(id);
    }
}
