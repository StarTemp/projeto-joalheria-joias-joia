package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Cartao;
import br.com.joalheriajoiasjoia.app.repositories.CartaoRepository;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;
    
    public Cartao saveCartao( Cartao cartao) {
        return cartaoRepository.save(cartao);
    }
    
    public List<Cartao> getAllCartao(){
        return cartaoRepository.findAll();
    }
    
    public Cartao getCartaoById (Long id) {
        return cartaoRepository.findById(id).orElse(null);
    }
    
    public void deleteCartao(Long id) {
        cartaoRepository.deleteById(id);
    }
}