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

import br.com.joalheriajoiasjoia.app.entities.Pagamento;
import br.com.joalheriajoiasjoia.app.services.PagamentoService;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    //Cria um novo Pagamento
    @PostMapping
    public Pagamento createPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.savePagamento(pagamento);
    }

    //Lista todos os Pagamentos
    @GetMapping
    public List<Pagamento> getAllPagamento() {
        return pagamentoService.getAllPagamento();
    }

    // Busca por id
    @GetMapping("/{id}")
    public Pagamento getPagamento(@PathVariable Long id) {
        return pagamentoService.getPagamentoById(id);
    }

    // Atualiza o Pagamento
    @PutMapping
    public Pagamento editPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.savePagamento(pagamento);
    }

    // Deleta um Pagamento
    @DeleteMapping("/{id}")
    public void deletePagamento(@PathVariable Long id) {
        pagamentoService.deletePagamento(id);
    }
}