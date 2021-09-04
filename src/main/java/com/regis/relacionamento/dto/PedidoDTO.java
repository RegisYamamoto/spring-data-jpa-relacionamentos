package com.regis.relacionamento.dto;

public class PedidoDTO {

	private Integer cliente;

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "PedidoDTO [cliente=" + cliente + "]";
	}

}
