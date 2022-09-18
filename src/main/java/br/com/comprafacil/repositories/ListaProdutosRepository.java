package br.com.comprafacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comprafacil.entities.ListaProdutos;

public interface ListaProdutosRepository extends JpaRepository<ListaProdutos, Long> {

}
