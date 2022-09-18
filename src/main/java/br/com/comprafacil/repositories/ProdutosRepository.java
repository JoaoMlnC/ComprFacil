package br.com.comprafacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comprafacil.entities.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}
