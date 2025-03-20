package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Pagamento;
import br.com.joalheriajoiasjoia.app.repositories.PagamentoRepository;


@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;
    
    public Pagamento savePagamento( Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
    
    public List<Pagamento> getAllPagamento(){
        return pagamentoRepository.findAll();
    }
    
    public Pagamento getPagamentoById (Long id) {
        return pagamentoRepository.findById(id).orElse(null);
    }
    
    public void deletePagamento(Long id) {
        pagamentoRepository.deleteById(id);
    }
}