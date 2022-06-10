package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class Pedido {
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	private String name;
	private String lastName;
	private String NIT;
	private String ciudad;
	private Long codProduct;
	private String cantproduct;
	
	public Pedido() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Long getCodProduct() {
		return codProduct;
	}

	public void setCodProduct(Long codProduct) {
		this.codProduct = codProduct;
	}

	public String getCantproduct() {
		return cantproduct;
	}

	public void setCantproduct(String cantproduct) {
		this.cantproduct = cantproduct;
	}
	
	
	
	
	
}
