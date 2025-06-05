package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_usuario")
public class TipoUsuario {
	
	//Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoUsuario", nullable = false)
    private Long idTipoUsuario;

    @Column(name = "nome", nullable = false)
    private String nome;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "idUsuario") 
    private List<Usuario> usuarios;
    
    
    //Construtores 
    public TipoUsuario() {
        
    }
    public TipoUsuario( Long idTipoUsuario, String nome) {
        this.idTipoUsuario = idTipoUsuario;
        this.nome = nome;
        
    }
    //getters e setters
    public Long getIdTipoUsuario() {
        return idTipoUsuario;
    }
    public void setIdTipoUsuario(Long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Usuario> getUsuario(){
    	return usuarios;
    }
    public void setUsuario(List<Usuario>usuarios) {
    	this.usuarios = usuarios;
    }
        
}
