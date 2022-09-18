package br.com.comprafacil.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "T_ADMIN_MERCADO")
public class AdminMercado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_admin_mercado")
	private Long codigo;

	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "ds_senha")
	private String senha;

	public AdminMercado(Long codigo, String email, String senha) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
	}

	public AdminMercado() {
		super();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, email, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminMercado other = (AdminMercado) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(email, other.email)
				&& Objects.equals(senha, other.senha);
	}

	
}
