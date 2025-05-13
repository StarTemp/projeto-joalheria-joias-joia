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
    
    //Salva um novo Pagamento
    public Pagamento savePagamento( Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
    // Busca todos os Pagamentos
    public List<Pagamento> getAllPagamento(){
        return pagamentoRepository.findAll();
    }
    // Busca por id
    public Pagamento getPagamentoById (Long id) {
        return pagamentoRepository.findById(id).orElse(null);
    }
    // Deleta um Pagamento
    public void deletePagamento(Long id) {
        pagamentoRepository.deleteById(id);
    }
}