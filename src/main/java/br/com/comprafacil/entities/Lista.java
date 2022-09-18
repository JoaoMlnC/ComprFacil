package br.com.comprafacil.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "T_LISTA")
public class Lista {
	

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_lista")
	private Long codigo;
	
	@Column(name = "vl_total_produtos")
	private double valorTotal;
	
	@Column(name = "qt_produtos")
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "cd_cliente")
	private Cliente cliente;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	@JoinColumn(name = "cd_lista")
	private List<ListaProdutos> produtos = new ArrayList<>();
	
	public Lista() {
		super();
	}

	public Lista(Long codigo, double valorTotal, Integer quantidade, Cliente cliente, List<ListaProdutos> produtos) {
		super();
		this.codigo = codigo;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ListaProdutos> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ListaProdutos> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, codigo, produtos, quantidade, valorTotal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lista other = (Lista) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(produtos, other.produtos) && Objects.equals(quantidade, other.quantidade)
				&& Double.doubleToLongBits(valorTotal) == Double.doubleToLongBits(other.valorTotal);
	}
	
	
}