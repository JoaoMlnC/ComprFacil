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
@Table(name = "T_PRODUTOS")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_produto")
	private Long codigo;
	
	@Column(name = "nm_produto")
	private String nome;
	
	@Column(name = "vl_produtos")
	private double valor;
	
	@Column(name = "tp_produtos")
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name = "cd_corredor", referencedColumnName = "cd_corredor")
	private Corredor corredorId ;


	public Produtos() {
		super();
	}

	public Produtos(Long codigo, String nome, double valor, String tipo, Corredor corredorId, Corredor corredorS) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
		this.corredorId = corredorId;
	
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Corredor getCorredorId() {
		return corredorId;
	}

	public void setCorredorId(Corredor corredorId) {
		this.corredorId = corredorId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, corredorId, nome, tipo, valor);
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
		return Objects.equals(codigo, other.codigo) && Objects.equals(corredorId, other.corredorId)
				&& Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
