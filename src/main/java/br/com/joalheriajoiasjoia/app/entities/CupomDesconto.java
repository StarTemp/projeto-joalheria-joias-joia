package br.com.joalheriajoiasjoia.app.entities;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cupom")
public class CupomDesconto {
    
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCupom", nullable = false)
    private Long idCupom;

    @Column(name = "codigo", nullable = false, length = 50)
    private String codigo;

    @Column(name = "discricao", nullable = false)
    private String discricao;

    @Column(name = "desconto", nullable = false)
    private Double desconto;

    @Column(name = "validade", nullable = true)
    private LocalDateTime validade;

    //construtores
    
    public CupomDesconto() {
        
    }
    public CupomDesconto(Long idCupom, String codigo, String discricao, Double desconto, LocalDateTime validade) {
        this.idCupom = idCupom;
        this.codigo = codigo;
        this.discricao = discricao;
        this.desconto = desconto;
        this.validade = validade;
    }
    
    //getters e setters
    public Long getIdCupom() {
        return idCupom;
    }
    public void setIdCupom(Long idCupom) {
        this.idCupom = idCupom;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDiscricao() {
        return discricao;
    }
    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }
    public Double getDesconto() {
        return desconto;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    public LocalDateTime getValidade() {
        return validade;
    }
    public void setValidade(LocalDateTime validade) {
        this.validade = validade;
    }
    
    
}
