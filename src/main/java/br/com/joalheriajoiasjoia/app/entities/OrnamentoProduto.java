package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamentoproduto")
public class OrnamentoProduto {

    //Atributos 
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_ornamentoProduto", nullable = false)
        private Long idOrnamentoProduto;

        @Column(name = "nome", nullable = false)
        private String nome;
        
        @Column(name = "descricao", nullable = false)
        private String descricao;
        
        @OneToMany(mappedBy = "idProduto") 
        private List<Produto> produtos;
        
        //construtores
        public OrnamentoProduto() {
            
        }
        public OrnamentoProduto(Long idOrnamentoProduto, String nome, String descricao ) {
            this.idOrnamentoProduto = idOrnamentoProduto;
            this.nome = nome;
            this.descricao = descricao;
        }
        
        //getters e setters
        public Long getIdOrnamentoProduto() {
            return idOrnamentoProduto;
        }
        public void setIdOrnamentoProduto(Long idOrnamentoProduto) {
            this.idOrnamentoProduto = idOrnamentoProduto;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getDescricao() {
            return descricao;
        }
        public void setDiscricao(String descricao) {
            this.descricao = descricao;
        }
        
        
}