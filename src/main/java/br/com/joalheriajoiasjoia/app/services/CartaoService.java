package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Cartao;
import br.com.joalheriajoiasjoia.app.repositories.CartaoRepository;

@Service
public class CartaoService {

	//ATRIBUTOS
    @Autowired
    private CartaoRepository cartaoRepository;
    
    //MÉTODOS
    //método para salvar um novo cartão
    public Cartao saveCartao( Cartao cartao) {
        return cartaoRepository.save(cartao);
    }
    
    //método para listar todos os cartões salvos
    public List<Cartao> getAllCartao(){
        return cartaoRepository.findAll();
    }
    
    //método para buscar um cartão pelo id
    public Cartao getCartaoById (Long id) {
        return cartaoRepository.findById(id).orElse(null);
    }
    
    //método para deletar um cartão pelo id
    public void deleteCartao(Long id) {
        cartaoRepository.deleteById(id);
    }
}