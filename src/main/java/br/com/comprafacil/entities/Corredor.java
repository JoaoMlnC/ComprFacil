package br.com.comprafacil.entities;

import java.util.Date;
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
@Table(name = "T_CORREDOR")

public class Corredor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_corredor")
	private long codigo;
	
	@Column(name = "in_sessao_corredor")
	private char sessao;
	
	@ManyToOne
	@JoinColumn(name = "cd_setor")
	private Setor setor;
	
	@Column(name = "nr_corredor")
	private int numeroCorredor;
	
	@Column(name = "dt_cadastro_corredor")
	private Date dataCadastro;

	public Corredor(long codigo, char sessao, Setor setor, int numeroCorredor, Date dataCadastro) {
		super();
		this.codigo = codigo;
		this.sessao = sessao;
		this.setor = setor;
		this.numeroCorredor = numeroCorredor;
		this.dataCadastro = dataCadastro;
	}

	public Corredor() {
		super();
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public char getSessao() {
		return sessao;
	}

	public void setSessao(char sessao) {
		this.sessao = sessao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public int getNumeroCorredor() {
		return numeroCorredor;
	}

	public void setNumeroCorredor(int numeroCorredor) {
		this.numeroCorredor = numeroCorredor;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, dataCadastro, numeroCorredor, sessao, setor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corredor other = (Corredor) obj;
		return codigo == other.codigo && Objects.equals(dataCadastro, other.dataCadastro)
				&& numeroCorredor == other.numeroCorredor && sessao == other.sessao
				&& Objects.equals(setor, other.setor);
	}

	
	
	
}
