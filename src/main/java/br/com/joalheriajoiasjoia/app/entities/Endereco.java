package br.com.joalheriajoiasjoia.app.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	
	@Column(name = "número", nullable = false, length = 4)
	private String numero;
	
	@Column(name = "rua", nullable = false)
	private String rua;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "cep", length = 8)
	private String cep;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "estado")
	private String estado;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	//CONSTRUTORES
	public Endereco() {
		
	}

	public Endereco(String numero, String rua, String bairro, String cidade, String cep, String complemento, String estado) {
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.complemento = complemento;
		this.estado = estado;
	}

	//GETTERS E SETTERS
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getId_Endereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
