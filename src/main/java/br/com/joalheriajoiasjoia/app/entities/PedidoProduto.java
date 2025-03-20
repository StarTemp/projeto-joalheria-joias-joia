package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedidoproduto")
public class PedidoProduto {

    //Atributos 
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idPedidoproduto", nullable = false)
        private Long idPedidoproduto;

        @Column(name = "quantidade", nullable = false, length = 50)
        private Integer quantidade;

        @Column(name = "preco_unitario", nullable = false)
        private Double preco_unitario;
        
        @ManyToOne
        @JoinColumn(name = "pedidoId")
        private Pedido pedidoId;
        
        //construtores
        public PedidoProduto() {
            
        }
        public PedidoProduto(Long idPedidoproduto, Integer quantidade, Double preco_unitario) {
            this.idPedidoproduto = idPedidoproduto;
            this.quantidade = quantidade;
            this.preco_unitario = preco_unitario;
            
        }
        public Long getIdPedidoproduto() {
            return idPedidoproduto;
        }
        public void setIdPedidoproduto(Long idPedidoproduto) {
            this.idPedidoproduto = idPedidoproduto;
        }
        public Integer getQuantidade() {
            return quantidade;
        }
        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }
        public Double getPreco_unitario() {
            return preco_unitario;
        }
        public void setPreco_unitario(Double preco_unitario) {
            this.preco_unitario = preco_unitario;
        }
        
        
}