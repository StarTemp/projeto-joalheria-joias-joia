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
	private Long idProduto;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "preco")
	private double preco;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "imagemUrl")
	private String imgUrl;
	
	@ManyToOne
	@JoinColumn(name = "material")
	private Material material;
	
	@ManyToOne
	@JoinColumn(name = "tipo")
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "categoria", nullable = false)
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "idOrnamentoProduto", nullable = false)
    private Long idOrnamentoProduto;
	
	
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

	public void setCor(String descricao) {
		this.descricao = descricao;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}