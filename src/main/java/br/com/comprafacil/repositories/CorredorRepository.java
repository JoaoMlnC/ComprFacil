package br.com.comprafacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comprafacil.entities.Corredor;

public interface CorredorRepository extends JpaRepository<Corredor, Long> {

}
