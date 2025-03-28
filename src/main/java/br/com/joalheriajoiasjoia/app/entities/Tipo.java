package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo")
public class Tipo {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipo;
	
	@Column(name = "nome", nullable = false)
    private String nome;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	//CONSTRUTORES
	public Tipo() {
		
	}
	
	public Tipo(Long idTipo, String descricao) {
		this.idTipo = idTipo;
		this.descricao = descricao;
	}

	//GETTERS E SETTERS
	public Long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setNome(String descricao) {
		this.descricao = descricao;
	}

}
