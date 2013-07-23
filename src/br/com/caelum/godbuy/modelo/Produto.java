package br.com.caelum.godbuy.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="tbProduto")
public class Produto {
	@Id @GeneratedValue
	@Column(name="idProduto")
	private Long id;
	
	@Column(name="nmProduto", nullable=false, length=30,unique=true)
	private String nome;
	
	@Column(name="dsProduto", nullable=false, length=100)
	private String descricao;
	
	@Column(name="prProduto", nullable=false)
	private Double preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[ID=").append(this.id)
		   .append(", NOME=").append(this.nome)
		   .append(", DESCRICAO=").append(this.descricao)
		   .append(", PRECO=").append(this.preco)
		   .append("]");
		return str.toString();
	}
}
