package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.joalheriajoiasjoia.app.entities.PedidoProduto;
import br.com.joalheriajoiasjoia.app.repositories.PedidoProdutoRepository;

@Service
public class PedidoProdutoService {
    @Autowired
    private PedidoProdutoRepository pedidoProdutoRepository;
    
    // Salva um novo PedidoProduto
    public PedidoProduto savePedidoProduto( PedidoProduto pedidoProduto) {
        return pedidoProdutoRepository.save(pedidoProduto);
    }
    // Buscar todos os PedidosProduto
    public List<PedidoProduto> getAllPedidoProduto(){
        return pedidoProdutoRepository.findAll();
    }
    // Buscar por id
    public PedidoProduto getPedidoProdutoById (Long id) {
        return pedidoProdutoRepository.findById(id).orElse(null);
    }
    // Deleta um PedidoProduto
    public void deletePedidoProduto(Long id) {
        pedidoProdutoRepository.deleteById(id);
    }
}