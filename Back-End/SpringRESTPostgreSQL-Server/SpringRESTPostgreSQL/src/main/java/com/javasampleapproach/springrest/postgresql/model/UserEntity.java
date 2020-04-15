package com.javasampleapproach.springrest.postgresql.model;

public class UserEntity {
	
	private Integer id;
	private String name;
	private String cpf;
	private Endereco endereco;
	private String dataDeNAscimento;
	private String email;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getDataDeNAscimento() {
		return dataDeNAscimento;
	}
	public void setDataDeNAscimento(String dataDeNAscimento) {
		this.dataDeNAscimento = dataDeNAscimento;
	}
	
	
	
}
