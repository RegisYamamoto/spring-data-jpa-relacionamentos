package com.regis.relacionamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "cliente_id", referencedColumnName = "id")
	private Cliente clienteId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getClienteId() {
		return clienteId;
	}

	public void setClienteId(Cliente clienteId) {
		this.clienteId = clienteId;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", clienteId=" + clienteId + "]";
	}

}
