package com.regis.relacionamento.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;
	
	@OneToOne(mappedBy = "clienteId")
	private Endereco endereco;

	@OneToMany(mappedBy = "clienteId")
	private List<Pedido> pedidos = new ArrayList<>();

}
