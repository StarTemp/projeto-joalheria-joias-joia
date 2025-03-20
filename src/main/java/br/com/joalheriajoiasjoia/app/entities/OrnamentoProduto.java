package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamentoproduto")
public class OrnamentoProduto {

    //Atributos 
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idOrnamentoProduto", nullable = false)
        private Long idOrnamentoProduto;

        @Column(name = "nome", nullable = false)
        private String nome;
        
        @Column(name = "discricao", nullable = false)
        private String discricao;
        
        //construtores
        public OrnamentoProduto() {
            
        }
        public OrnamentoProduto(Long idOrnamentoProduto, String nome, String discricao ) {
            this.idOrnamentoProduto = idOrnamentoProduto;
            this.nome = nome;
            this.discricao = discricao;
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
        public String getDiscricao() {
            return discricao;
        }
        public void setDiscricao(String discricao) {
            this.discricao = discricao;
        }
        
        
}