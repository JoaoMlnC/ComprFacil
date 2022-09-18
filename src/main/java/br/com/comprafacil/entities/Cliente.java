package br.com.comprafacil.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLIENTE")
public class Cliente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "cd_cliente")
private Long codigo;

@Column(name = "nm_cliente")
private String nome;

@Column(name = "ds_email", unique = true)
private String email;

@Column(name = "ds_genero")
private char genero;

@Column(name = "ds_senha")
private String senha;

@Column(name = "dt_nascimento")
private Date dtNascimento;

@Column(name = "nr_telefone")
private Long telefone;

@Column(name = "ds_cpf", unique = true)
private String cpf;



public Cliente() {
	super();
}

public Cliente(Long codigo, String nome, String email, char genero, String senha, Date dtNascimento, Long telefone,
		String cpf) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.email = email;
	this.genero = genero;
	this.senha = senha;
	this.dtNascimento = dtNascimento;
	this.telefone = telefone;
	this.cpf = cpf;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public char getGenero() {
	return genero;
}

public void setGenero(char genero) {
	this.genero = genero;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

public Date getDtNascimento() {
	return dtNascimento;
}

public void setDtNascimento(Date dtNascimento) {
	this.dtNascimento = dtNascimento;
}

public Long getTelefone() {
	return telefone;
}

public void setTelefone(Long telefone) {
	this.telefone = telefone;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

@Override
public int hashCode() {
	return Objects.hash(codigo, cpf, dtNascimento, email, genero, nome, senha, telefone);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cliente other = (Cliente) obj;
	return Objects.equals(codigo, other.codigo) && Objects.equals(cpf, other.cpf)
			&& Objects.equals(dtNascimento, other.dtNascimento) && Objects.equals(email, other.email)
			&& genero == other.genero && Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
			&& Objects.equals(telefone, other.telefone);
}

public void setId(Long id) {
	// TODO Auto-generated method stub
	
}


}


