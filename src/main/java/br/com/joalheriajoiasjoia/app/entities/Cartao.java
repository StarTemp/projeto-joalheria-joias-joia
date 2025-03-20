package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Cartao {

    //Atributos 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCartao", nullable = false)
    private Long idCartao;

    @Column(name = "valorPago", nullable = false)
    private Double valorPago;
    
    @Column(name = "status", nullable = false)
    private String status;
    
    @Column(name = "metodoPagamento", nullable = false)
    private String metodoPagamento;

    @Column(name = "datapagamento", nullable = false)
    private LocalDateTime datapagamento;
    

    @OneToMany
    @JoinColumn(name = "pedidoId")
    private Pagamento pedidoId;
    
    //construtores
    public Cartao() {
        
    }
    public Cartao(Long idCartao, Double valorPago, String status, String metodoPagamento, LocalDateTime datapagamento) {
        this.idCartao = idCartao;
        this.valorPago = valorPago;
        this.status = status;
        this.metodoPagamento = metodoPagamento;
        this.datapagamento = datapagamento;
        
    }
    
    //getters e setters
    public Long getIdCartao() {
        return idCartao;
    }
    public void setIdCartao(Long idCartao) {
        this.idCartao = idCartao;
    }
    public Double getValorPago() {
        return valorPago;
    }
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public LocalDateTime getDatapagamento() {
        return datapagamento;
    }
    public void setDatapagamento(LocalDateTime datapagamento) {
        this.datapagamento = datapagamento;
    }
    
    
    
    
}
