package com.javasampleapproach.springrest.postgresql.model;

import java.util.Date;

public class PedidoEntity {


	private Integer idDoPedido;
	private String enderecoDeEntrega;
	private String descricaoDoPedido;
	private Date dataDoPedido;
	private Date dataDeEntrega;
	private Date horaDoPedido;
	private Boolean entregue;
	private Endereco endereco;
	private Integer quantidade;
	private Integer valor;
	private UserEntity userClient;
	
	
	
	
	
	public UserEntity getUserClient() {
		return userClient;
	}
	public void setUserClient(UserEntity userClient) {
		this.userClient = userClient;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Integer getIdDoPedido() {
		return idDoPedido;
	}
	public void setIdDoPedido(Integer idDoPedido) {
		this.idDoPedido = idDoPedido;
	}
	public String getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}
	public void setEnderecoDeEntrega(String enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}
	public String getDescricaoDoPedido() {
		return descricaoDoPedido;
	}
	public void setDescricaoDoPedido(String descricaoDoPedido) {
		this.descricaoDoPedido = descricaoDoPedido;
	}
	public Date getDataDoPedido() {
		return dataDoPedido;
	}
	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}
	public Date getDataDeEntrega() {
		return dataDeEntrega;
	}
	public void setDataDeEntrega(Date dataDeEntrega) {
		this.dataDeEntrega = dataDeEntrega;
	}
	public Date getHoraDoPedido() {
		return horaDoPedido;
	}
	public void setHoraDoPedido(Date horaDoPedido) {
		this.horaDoPedido = horaDoPedido;
	}
	public Boolean getEntregue() {
		return entregue;
	}
	public void setEntregue(Boolean entregue) {
		this.entregue = entregue;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
