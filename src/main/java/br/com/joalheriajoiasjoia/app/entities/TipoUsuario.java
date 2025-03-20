package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {
	
	//Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipo_usuario", nullable = false)
    private Long idTipoUsuario;

    @Column(name = "nome", nullable = false)
    private String nome;
    
    //Construtores 
    public TipoUsuario() {
        
    }
    public TipoUsuario( Long idTipoUsuario, String nome) {
        this.idTipoUsuario = idTipoUsuario;
        this.nome = nome;
        
    }
    public Long getIdTipo_usuario() {
        return idTipoUsuario;
    }
    public void setIdTipo_usuario(Long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
        
}
