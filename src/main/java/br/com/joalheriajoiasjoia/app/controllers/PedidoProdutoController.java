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

import br.com.joalheriajoiasjoia.app.entities.PedidoProduto;
import br.com.joalheriajoiasjoia.app.services.PedidoProdutoService;

@RestController
@RequestMapping("/pedidoproduto")
public class PedidoProdutoController {
    @Autowired
    private PedidoProdutoService pedidoProdutoService;

    //Criar um novo PedidoProduto
    @PostMapping
    public PedidoProduto createPedidoProduto(@RequestBody PedidoProduto pedidoProduto) {
        return pedidoProdutoService.savePedidoProduto(pedidoProduto);
    }

    // Listar todos os PedidosProdutos
    @GetMapping
    public List<PedidoProduto> getAllPedidoProduto() {
        return pedidoProdutoService.getAllPedidoProduto();
    }

    // Buscar por Id
    @GetMapping("/{id}")
    public PedidoProduto getPedidoProduto(@PathVariable Long id) {
        return pedidoProdutoService.getPedidoProdutoById(id);
    }

    //Atualiza o PedidoProduto
    @PutMapping
    public PedidoProduto editPedidoProduto(@RequestBody PedidoProduto pedidoProduto) {
        return pedidoProdutoService.savePedidoProduto(pedidoProduto);
    }

    // Deleta um PedidoProduto
    @DeleteMapping("/{id}")
    public void deletePedidoProduto(@PathVariable Long id) {
        pedidoProdutoService.deletePedidoProduto(id);
    }
}