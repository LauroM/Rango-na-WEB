package com.junitTestes;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.javasampleapproach.springrest.postgresql.model.Endereco;
import com.javasampleapproach.springrest.postgresql.model.PedidoEntity;

public class JUnitPedidoTest {



	


	public Boolean registerOrder(PedidoEntity pedido) {
		
		Date today = new Date();
		
		
		
		
		if(pedido.getEndereco() != null && pedido.getUserClient() != null ) {
		
			if(pedido.getDataDoPedido() == null) {
				pedido.setDataDoPedido(today);
			}
		
			if(pedido.getQuantidade()<=0) {
				// coloca o minimo ou retorna erro
				//pedido.setQuantidade(1);
				return false;
			}
			
			if(pedido.getValor() == null || pedido.getValor() < 0) {
				return false;
			}
		
		}
		
		
		
		return false;

	}



	@Test
	public void testeConfiguracao(){
		
		PedidoEntity pedido = new PedidoEntity();
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Sagrada FAmilia");
		endereco.setCep("31031-120");
		endereco.setCidade("Belo Horizonte");
		endereco.setEstado("Minas Gerais");
		endereco.setNumero("150");
		endereco.setRua("Antonio Eustaquio");
		endereco.setId(1);
		
		
		pedido.setValor(75);
		pedido.setDataDeEntrega(null);
		pedido.setDataDoPedido(null);
		pedido.setEndereco(null);
		pedido.setEnderecoDeEntrega("");
		pedido.setEntregue(false);
		pedido.setHoraDoPedido(null);
		pedido.setIdDoPedido(1);
		Assert.assertTrue(registerOrder(pedido));
	}



}
