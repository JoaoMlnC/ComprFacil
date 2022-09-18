package br.com.comprafacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comprafacil.entities.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long> {

}
