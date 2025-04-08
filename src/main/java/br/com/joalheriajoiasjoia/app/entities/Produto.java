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
@Table(name = "tb_produto")
public class Produto {

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduto", nullable = false)
	private Long idProduto;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "preco", nullable = false)
	private double preco;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "imagemUrl", nullable = false)
	private String imgUrl;
	
	@ManyToOne
	@JoinColumn(name = "tipo", nullable = false)
	private Tipo idTipo;
	
	@ManyToOne
	@JoinColumn(name = "categoria", nullable = false)
	private Categoria idCategoria;
	
	@ManyToOne
	@JoinColumn(name = "idOrnamentoProduto", nullable = false)
    private OrnamentoProduto idOrnamentoProduto;
	
	
	//CONSTRUTORES
	public Produto() {
		
	}
	
	public Produto(Long idProduto, String nome, double preco, String descricao, String imgUrl) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.imgUrl = imgUrl;
	}
	
	//GETTERS E SETTERS
	public Long getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Tipo getTipo() {
		return idTipo;
	}

	public void setTipo(Tipo idTipo) {
		this.idTipo = idTipo;
	}

	public Categoria getCategoria() {
		return idCategoria;
	}

	public void setCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

	public OrnamentoProduto getIdOrnamentoProduto() {
		return idOrnamentoProduto;
	}

	public void setIdOrnamentoProduto(OrnamentoProduto idOrnamentoProduto) {
		this.idOrnamentoProduto = idOrnamentoProduto;
	}
	
}