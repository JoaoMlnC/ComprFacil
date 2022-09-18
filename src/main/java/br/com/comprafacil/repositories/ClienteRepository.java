package br.com.comprafacil.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comprafacil.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
