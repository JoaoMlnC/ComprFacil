package br.com.comprafacil.entities;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_MERCADO")
public class Mercado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_mercado")
	private Long codigo;
	

	@OneToOne(
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	@JoinColumn(name = "cd_admin_mercado")
	private AdminMercado admin;
	
	@Column(name = "nm_mercado")
	private String nome;
	
	@Column(name = "ds_endereco")
	private String endereco;
	
	@Column(name = "dt_cadastro")
	private LocalDate dataCadastro;

	public Mercado(Long codigo, AdminMercado admin, String nome, String endereco, LocalDate dataCadastro) {
		super();
		this.codigo = codigo;
		this.admin = admin;
		this.nome = nome;
		this.endereco = endereco;
		this.dataCadastro = dataCadastro;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public AdminMercado getAdmin() {
		return admin;
	}

	public void setAdmin(AdminMercado admin) {
		this.admin = admin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(admin, codigo, dataCadastro, endereco, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercado other = (Mercado) obj;
		return Objects.equals(admin, other.admin) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(dataCadastro, other.dataCadastro) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(nome, other.nome);
	}

	public Mercado() {
		super();
	}

	
}
