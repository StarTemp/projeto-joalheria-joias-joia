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

import br.com.joalheriajoiasjoia.app.entities.OrnamentoProduto;
import br.com.joalheriajoiasjoia.app.services.OrnamentoProdutoService;

@RestController
@RequestMapping("/ornamentoproduto")
public class OrnamentoProdutoController {

    @Autowired
    private OrnamentoProdutoService ornamentoProdutoService;

    //Cria um novo OrnamentoProduto
    @PostMapping
    public OrnamentoProduto createOrnamentoProduto(@RequestBody OrnamentoProduto ornamentoProduto) {
        return ornamentoProdutoService.saveOrnamentoProduto(ornamentoProduto);
    }

    //Lista todos os OrnamentosProdutos
    @GetMapping
    public List<OrnamentoProduto> getAllOrnamentoProduto() {
        return ornamentoProdutoService.getAllOrnamentoProduto();
    }

    //Busca pro id
    @GetMapping("/{id}")
    public OrnamentoProduto getOrnamentoProduto(@PathVariable Long id) {
        return ornamentoProdutoService.getOrnamentoProdutoById(id);
    }

    //Atualiza o OrnamentoProduto
    @PutMapping
    public OrnamentoProduto editOrnamentoProduto(@RequestBody OrnamentoProduto ornamentoProduto) {
        return ornamentoProdutoService.saveOrnamentoProduto(ornamentoProduto);
    }

    //Deleta um OrnamentoProduto
    @DeleteMapping("/{id}")
    public void deleteOrnamentoProduto(@PathVariable Long id) {
        ornamentoProdutoService.deleteOrnamentoProduto(id);
    }
}