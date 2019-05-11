package com.daniella.Etecs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="CADASTRO")
public class Cadastro extends BaseORM{
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="CODIGO")
	private int codigo;
	
	@Column(name="CEP")
	private String CEP;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="BAIRRO")
	private String bairro;
	
	@Column(name="CIDADE")
	private String cidade;
	
	@Column(name="LATITUDE")
	private Double latitude;
	
	@Column(name="LONGITUDE")
	private Double longitude;
	
}
