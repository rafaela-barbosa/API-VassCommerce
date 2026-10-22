package br.com.rafaelaBarbosa.projeto_vass_commerce.categoria;

import br.com.rafaelaBarbosa.projeto_vass_commerce.produto.Produto;

import java.util.List;
import java.util.ArrayList;

public class Categoria {

	private long id;
	private String imagemSimboloURL;
	private String nome;
	private String descricao;
	private List<Produto> produtos;

	public Categoria (String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.produtos = new ArrayList<>();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImagemSimboloURL() {
		return imagemSimboloURL;
	}

	public void setImagemSimboloURL(String imagemSimboloURL) {
		this.imagemSimboloURL = imagemSimboloURL;
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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
