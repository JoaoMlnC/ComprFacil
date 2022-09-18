package br.com.comprafacil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.comprafacil.entities.Produtos;

import br.com.comprafacil.repositories.ProdutosRepository;
@RestController
@RequestMapping(value = "/produtos")
public class ProdutosController {


		@Autowired
		private ProdutosRepository repository;
		
		@GetMapping
		public List<Produtos> findAll() {
			List<Produtos> result = repository.findAll();
			return result;
		}
		
		@GetMapping(value = "/{id}")
		public Produtos findById(@PathVariable Long id) {
			Produtos result = repository.findById(id).get();
			return result;
		}
		
		@PostMapping
		public Produtos insert(@RequestBody Produtos produtos) {
			Produtos result = repository.save(produtos);
			return result;
		}
	}

