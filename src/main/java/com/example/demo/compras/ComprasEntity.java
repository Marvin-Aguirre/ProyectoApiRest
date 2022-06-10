package com.example.demo.compras;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class ComprasEntity {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	private String test;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
