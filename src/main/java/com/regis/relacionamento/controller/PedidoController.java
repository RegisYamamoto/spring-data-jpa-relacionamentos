//package com.regis.relacionamento.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.regis.relacionamento.dto.PedidoDTO;
//import com.regis.relacionamento.model.Cliente;
//import com.regis.relacionamento.model.Pedido;
//import com.regis.relacionamento.repository.PedidoRepository;
//
//@RestController
//@RequestMapping(value = "/pedidos")
//public class PedidoController {
//	
//	@Autowired
//	private PedidoRepository pedidoRepository;
//
//	@PostMapping(value = "")
//	public Pedido salvarPedido(@RequestBody PedidoDTO pedidoDto) {
//		Pedido pedido = new Pedido();
//		pedido.setId(1001);
//		
//		Cliente cliente = new Cliente();
//		cliente.setId(pedidoDto.getCliente());
//		pedido.setClienteId(cliente);
//		return pedidoRepository.save(pedido);
//	}
//	
//}
