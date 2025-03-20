package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	
  //Atributos 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido", nullable = false)
    private Long idPedido;

    @Column(name = "codigo", nullable = false, length = 50)
    private String codigo;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "total", nullable = false)
    private String total;

    @Column(name = "datapedido", nullable = true)
    private LocalDateTime datapedido;
    
    @ManyToOne
    @JoinColumn(name = "enderecoId")
    private Endereco enderecoId;
    
    @ManyToOne
    @JoinColumn(name = "usuarioId")
    private Usuario usuarioId;
    
    @ManyToOne
    @JoinColumn(name = "cupomdesconto")
    private CupomDesconto cupomdesconto;
    
    //construtores
    public Pedido() {
        
    }
    public Pedido(Long idPedido, String codigo, String status, String total, LocalDateTime datapedido) {
        this.idPedido = idPedido;
        this.codigo = codigo;
        this.status = status;
        this.total = total;
        this.datapedido = datapedido;
    }
    
    //getters e setters 
    public Long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTotal() {
        return total;
    }
    public void setTotal(String total) {
        this.total = total;
    }
    public LocalDateTime getDatapedido() {
        return datapedido;
    }
    public void setDatapedido(LocalDateTime datapedido) {
        this.datapedido = datapedido;
    }
    
    
}