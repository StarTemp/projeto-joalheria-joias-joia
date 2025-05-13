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
    
    //salva um novo Pedido
    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    // Busca todos os Pedidos
    public List<Pedido> getAllPedido(){
        return pedidoRepository.findAll();
    }
    // Buscar Pedido por id
    public Pedido getPedidoById (Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    // Deletar pedido
    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}