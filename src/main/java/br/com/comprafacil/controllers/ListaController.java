package br.com.comprafacil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.comprafacil.entities.Lista;
import br.com.comprafacil.repositories.ListaRepository;

@RestController
@RequestMapping(value = "/listas")
public class ListaController {

	@Autowired
	private ListaRepository repository;
	
	@GetMapping
	public List<Lista> findAll() {
		List<Lista> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Lista findById(@PathVariable Long id) {
		Lista result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public Lista insert(@RequestBody Lista lista) {
		Lista result = repository.save(lista);
		return result;
	}
}
