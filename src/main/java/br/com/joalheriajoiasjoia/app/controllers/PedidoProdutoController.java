package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.joalheriajoiasjoia.app.entities.PedidoProduto;
import br.com.joalheriajoiasjoia.app.services.PedidoProdutoService;



@Controller
public class PedidoProdutoController {
    @Autowired
    private PedidoProdutoService pedidoProdutoService;

    @PostMapping
    public PedidoProduto createPedidoProduto(@RequestBody PedidoProduto pedidoProduto) {
        return pedidoProdutoService.savePedidoProduto(pedidoProduto);
    }

    @GetMapping
    public List<PedidoProduto> getAllPedidoProduto() {
        return pedidoProdutoService.getAllPedidoProduto();
    }

    @GetMapping("/{id}")
    public PedidoProduto getPedidoProduto(@PathVariable Long id) {
        return pedidoProdutoService.getPedidoProdutoById(id);
    }

    @PutMapping
    public PedidoProduto editPedidoProduto(@RequestBody PedidoProduto pedidoProduto) {
        return pedidoProdutoService.savePedidoProduto(pedidoProduto);
    }

    @DeleteMapping("/{id}")
    public void deletePedidoProduto(@PathVariable Long id) {
        pedidoProdutoService.deletePedidoProduto(id);
    }
}