package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.FacturacionRepository;
import com.example.demo.facturacion.FacturacionEntity;

@Service
public class FacturacionService {

	@Autowired
	private FacturacionRepository facturacion;
	
	public List<FacturacionEntity> listAll() {
		return facturacion.findAll();
	}
	
	public void save(FacturacionEntity Save) {
		facturacion.save(Save);
	}
	
	public FacturacionEntity get(long id) {
		return facturacion.findById(id).get();
				
	}
	
	public void delete(long id) {
		facturacion.deleteById(id);
	}
	
}
