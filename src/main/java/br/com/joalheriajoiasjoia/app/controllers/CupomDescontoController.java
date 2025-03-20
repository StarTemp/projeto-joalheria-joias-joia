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

    @Autowired
    private CupomDescontoService cupomService;

    @PostMapping
    public CupomDesconto createCupom(@RequestBody CupomDesconto cupom) {
        return cupomService.saveCupom(cupom);
    }

    @GetMapping
    public List<CupomDesconto> getAllCupom() {
        return cupomService.getAllCupom();
    }

    @GetMapping("/{id}")
    public CupomDesconto getCupom(@PathVariable Long id) {
        return cupomService.getCupomById(id);
    }

    @PutMapping
    public CupomDesconto editCupom(@RequestBody CupomDesconto cupom) {
        return cupomService.saveCupom(cupom);
    }

    @DeleteMapping("/{id}")
    public void deleteCupom(@PathVariable Long id) {
        cupomService.deleteCupom(id);
    }
}
