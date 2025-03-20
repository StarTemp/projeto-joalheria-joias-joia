package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.CupomDesconto;
import br.com.joalheriajoiasjoia.app.repositories.CupomDescontoRepository;

@Service
public class CupomDescontoService {

    @Autowired
    private CupomDescontoRepository cupomRepository;
    
    public CupomDesconto saveCupom(CupomDesconto cupom) {
        return cupomRepository.save(cupom);
    }
    
    public List<CupomDesconto> getAllCupom(){
        return cupomRepository.findAll();
    }
    
    public CupomDesconto getCupomById (Long id) {
        return cupomRepository.findById(id).orElse(null);
    }
    
    public void deleteCupom(Long id) {
        cupomRepository.deleteById(id);
    }
}
