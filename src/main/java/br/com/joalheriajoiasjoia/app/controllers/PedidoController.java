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

import br.com.joalheriajoiasjoia.app.entities.Pedido;
import br.com.joalheriajoiasjoia.app.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    //Criar um novo Pedido
    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoService.savePedido(pedido);
    }
 
    //Lista todos os Pedidos
    @GetMapping
    public List<Pedido> getAllPedido() {
        return pedidoService.getAllPedido();
    }
 
    // Busca pro id
    @GetMapping("/{id}")
    public Pedido getPedido(@PathVariable Long id) {
        return pedidoService.getPedidoById(id);
    }
    
    // Atualiza o Pedido
    @PutMapping
    public Pedido editPedido(@RequestBody Pedido pedido) {
        return pedidoService.savePedido(pedido);
    }
    // Deleta um Pedido
    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id) {
        pedidoService.deletePedido(id);
    }
}
