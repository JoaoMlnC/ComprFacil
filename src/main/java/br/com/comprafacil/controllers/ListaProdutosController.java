package br.com.comprafacil.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.comprafacil.entities.ListaProdutos;
import br.com.comprafacil.repositories.ListaProdutosRepository;


@RestController
@RequestMapping(value = "/lista/produtos")
public class ListaProdutosController {

	@Autowired
	private ListaProdutosRepository repository;
	
	@GetMapping
	public List<ListaProdutos> findAll() {
		List<ListaProdutos> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public ListaProdutos findById(@PathVariable Long id) {
		ListaProdutos result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public ListaProdutos insert(@RequestBody ListaProdutos listaProdutos) {
		ListaProdutos result = repository.save(listaProdutos);
		return result;
	}
}
