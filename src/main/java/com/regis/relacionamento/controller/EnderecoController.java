package com.regis.relacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regis.relacionamento.model.Endereco;
import com.regis.relacionamento.repository.EnderecoRepository;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping(value = "/{id}")
	public Endereco buscarEnderecoPorId(@PathVariable Integer id) {
		return enderecoRepository.findById(id).orElse(null);
	}
	
}
