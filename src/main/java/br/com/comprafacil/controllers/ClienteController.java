package br.com.comprafacil.controllers;

import java.awt.print.Pageable;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.comprafacil.entities.Cliente;
import br.com.comprafacil.entities.Produtos;
import br.com.comprafacil.service.ClienteService;



@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	

	 	@Autowired
	    private ClienteService service;
		
	 	  @GetMapping
	 	  public List<Cliente> index(){
	 	        return service.listAll();
	 	    }

	 	 @PostMapping
	    
	     public ResponseEntity<Cliente> create(@RequestBody  Cliente cliente){
	         service.save(cliente);
	         return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
	     }

	 	    @GetMapping("{id}")
	 	    public ResponseEntity<Cliente> show(@PathVariable Long id){
	 	        return ResponseEntity.of(service.getById(id));
	 	    }

	 	    @DeleteMapping("{id}")
	 	    public ResponseEntity<Object> destroy(@PathVariable Long id){

	 	        Optional<Cliente> optional = service.getById(id);

	 	        if(optional.isEmpty())
	 	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

	 	        service.deleteById(id);
	 	        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	 	    }

	 	    @PutMapping("{id}")
	 	    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente newCliente){
	 	      
	 	        Optional<Cliente> optional = service.getById(id);

	 	        
	 	        if(optional.isEmpty())
	 	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

	 	        
	 	        var cliente = optional.get();
	 	        BeanUtils.copyProperties(newCliente, cliente);
	 	        cliente.setId(id);

	 	    
	 	        service.save(cliente);

	 	        return ResponseEntity.ok(cliente);
	 	    }
	 	}
	
	
	

		
