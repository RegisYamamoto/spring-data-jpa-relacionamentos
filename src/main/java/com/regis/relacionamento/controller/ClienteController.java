package com.regis.relacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.relacionamento.model.Cliente;
import com.regis.relacionamento.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping(value = "/{id}")
	public Cliente buscarClientePorId(@PathVariable Integer id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
//	@PostMapping(value = "")
//	public Cliente salvarCliente(@RequestBody Cliente cliente) {
//		cliente.setId(1);
//		return clienteRepository.save(cliente);
//	}
	
}
