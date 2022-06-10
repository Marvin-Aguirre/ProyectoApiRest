package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ComprasRepository;
import com.example.demo.compras.ComprasEntity;

@Service
public class ComprasService {
	
	@Autowired
	private ComprasRepository compras;
	
	public List<ComprasEntity> listAll() {
		return compras.findAll();
	}
	
	public void save(ComprasEntity Save) {
		compras.save(Save);
	}
	
	public ComprasEntity get(long id) {
		return compras.findById(id).get();
				
	}
	
	public void delete(long id) {
		compras.deleteById(id);
	}

}
