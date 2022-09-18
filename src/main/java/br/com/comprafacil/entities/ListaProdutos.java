package br.com.comprafacil.entities;



import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_LISTA_PRODUTOS")
public class ListaProdutos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_lista_produto")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "cd_lista")
	private Lista lista ;
	
	@ManyToOne
	@JoinColumn(name = "cd_produto")
	private Produtos produto ;

	public ListaProdutos() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	public ListaProdutos(Long id, Produtos produto) {
		super();
		this.id = id;
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, lista, produto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaProdutos other = (ListaProdutos) obj;
		return Objects.equals(id, other.id) && Objects.equals(lista, other.lista)
				&& Objects.equals(produto, other.produto);
	}



}


