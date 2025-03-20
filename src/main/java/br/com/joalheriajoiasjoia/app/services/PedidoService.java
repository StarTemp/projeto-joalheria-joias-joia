package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Pedido;
import br.com.joalheriajoiasjoia.app.repositories.PedidoRepository;

@Service
public class PedidoService {


    @Autowired
    private PedidoRepository pedidoRepository;
    
    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    
    public List<Pedido> getAllPedido(){
        return pedidoRepository.findAll();
    }
    
    public Pedido getPedidoById (Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    
    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}