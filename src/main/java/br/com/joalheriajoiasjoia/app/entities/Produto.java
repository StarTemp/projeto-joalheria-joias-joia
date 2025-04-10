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
	
	@Column(name = "nomeProduto", nullable = false, length = 100)
	private String nomeProduto;
	
	@Column(name = "preco", nullable = false)
	private double preco;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "imagemUrl", nullable = false)
	private String imgUrl;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private Tipo idTipo;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria idCategoria;
	
	@ManyToOne
	@JoinColumn(name = "id_ornamentoProduto")
    private OrnamentoProduto idOrnamentoProduto;
	
	
	//CONSTRUTORES
	public Produto() {
		
	}
	
	public Produto(Long idProduto, String nomeProduto, double preco, String descricao, String imgUrl) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
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
		return nomeProduto;
	}

	public void setNome(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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
}