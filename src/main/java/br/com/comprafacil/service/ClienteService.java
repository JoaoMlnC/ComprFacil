package br.com.comprafacil.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.com.comprafacil.entities.Cliente;
import br.com.comprafacil.repositories.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository repository;

   
	public List  <Cliente> listAll(){
       return  repository.findAll();
    }

    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    public Optional<Cliente> getById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }



}
