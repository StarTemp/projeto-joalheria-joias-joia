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

import br.com.joalheriajoiasjoia.app.entities.CupomDesconto;
import br.com.joalheriajoiasjoia.app.services.CupomDescontoService;

@RestController
@RequestMapping("/cupom")
public class CupomDescontoController {

	//ATRIBUTOS
    @Autowired
    private CupomDescontoService cupomService;

    //MÉTODOS
    //método para postar/salvar um cupom
    @PostMapping
    public CupomDesconto createCupom(@RequestBody CupomDesconto cupom) {
        return cupomService.saveCupom(cupom);
    }

    //método para listar todos os cupons
    @GetMapping
    public List<CupomDesconto> getAllCupom() {
        return cupomService.getAllCupom();
    }
    
    //método para buscar o cupom pelo id
    @GetMapping("/{id}")
    public CupomDesconto getCupom(@PathVariable Long id) {
        return cupomService.getCupomById(id);
    }

    //método para atualizar o cupom
    @PutMapping
    public CupomDesconto editCupom(@RequestBody CupomDesconto cupom) {
        return cupomService.saveCupom(cupom);
    }

    //método para deletar um cupom
    @DeleteMapping("/{id}")
    public void deleteCupom(@PathVariable Long id) {
        cupomService.deleteCupom(id);
    }
}
