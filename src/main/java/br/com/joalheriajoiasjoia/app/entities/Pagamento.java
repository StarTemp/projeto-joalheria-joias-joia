package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
    //Atributos 
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "idPagamento", nullable = false)
            private Long idPagamento;

            @Column(name = "valorPago", nullable = false, length = 50)
            private Double valorPago;
            
            @Column(name = "status", nullable = false, length = 50)
            private String status;
            
            @Column(name = "metodoPagamento", nullable = false, length = 50)
            private String metodoPagamento;

            @Column(name = "pagamento", nullable = false)
            private LocalDateTime pagamento;
            
            @OneToOne
            @JoinColumn(name = "pedidoId")
            private Pedido pedidoId;
            
            //construtores
            public Pagamento() {
                
            }
            
            public Pagamento(Long idPagamento, Double valorPago, String status, String metodoPagamento, LocalDateTime pagamento) {
                this.idPagamento = idPagamento;
                this.valorPago = valorPago;
                this.status = status;
                this.metodoPagamento = metodoPagamento;
                this.pagamento = pagamento;
            }

            //getters e setters
            public Long getIdPagamento() {
                return idPagamento;
            }

            public void setIdPagamento(Long idPagamento) {
                this.idPagamento = idPagamento;
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

            public LocalDateTime getPagamento() {
                return pagamento;
            }

            public void setPagamento(LocalDateTime pagamento) {
                this.pagamento = pagamento;
            }
            

}
