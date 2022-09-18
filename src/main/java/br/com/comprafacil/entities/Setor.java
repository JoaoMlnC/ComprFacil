package br.com.comprafacil.entities;

import java.time.LocalDate;
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
@Table(name = "T_SETOR")
public class Setor {

	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "cd_setor")
		private Long id;
		
		@Column(name = "nm_setor")
		private String nome;

		@Column(name = "ds_setor")
		private String descricao;
		
		@Column(name = "dt_cadastro_setor")
		private LocalDate data;
		
		@ManyToOne
		@JoinColumn(name = "cd_mercado")
		private Mercado mercado;

		public Setor(Long id, String nome, String descricao, LocalDate data, Mercado mercado) {
			super();
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.data = data;
			this.mercado = mercado;
		}

		public Setor() {
			super();
		}

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

		public LocalDate getData() {
			return data;
		}

		public void setData(LocalDate data) {
			this.data = data;
		}

		public Mercado getMercado() {
			return mercado;
		}

		public void setMercado(Mercado mercado) {
			this.mercado = mercado;
		}

		@Override
		public int hashCode() {
			return Objects.hash(data, descricao, id, mercado, nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Setor other = (Setor) obj;
			return Objects.equals(data, other.data) && Objects.equals(descricao, other.descricao)
					&& Objects.equals(id, other.id) && Objects.equals(mercado, other.mercado)
					&& Objects.equals(nome, other.nome);
		}


}

