package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Cartao;
import br.com.joalheriajoiasjoia.app.services.CartaoService;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

	//ATRIBUTOS
    @Autowired
    private CartaoService cartaoService;

    //MÉTODOS
    //método para postar/salvar um novo cartão
    @PostMapping
    public Cartao createCartao(@RequestBody Cartao cartao) {
        return cartaoService.saveCartao(cartao);
    }

    //método para listar todos os cartões
    @GetMapping
    public List<Cartao> getAllCartao() {
        return cartaoService.getAllCartao();
    }

    //método para buscar o cartão pelo id
    @GetMapping("/{id}")
    public Cartao getCartao(@PathVariable Long id) {
        return cartaoService.getCartaoById(id);
    }

    //método para atualizar um cartão
    @PutMapping
    public Cartao editPagamento(@RequestBody Cartao pagamento) {
        return cartaoService.saveCartao(pagamento);
    }

    //método para deletar o cartão pelo id
    @DeleteMapping("/{id}")
    public void deleteCartao(@PathVariable Long id) {
        cartaoService.deleteCartao(id);
    }
}