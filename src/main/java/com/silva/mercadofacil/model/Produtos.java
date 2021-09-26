package com.silva.mercadofacil.model;

import java.util.Objects;

public class Produtos {
	
	private Integer id;
	private String produto;
	private String marca;
	private String categoria;
	private Integer quantidade;
	private Double valor;
	private Integer descricao;
	
	
	public Produtos(Integer id, String produto, String marca, String categoria, Integer quantidade, Double valor,
			Integer descricao) {
		super();
		this.id = id;
		this.produto = produto;
		this.marca = marca;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getDescricao() {
		return descricao;
	}
	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return Objects.equals(id, other.id);
	}

	
}
