package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.compras.ComprasEntity;

public interface ComprasRepository extends JpaRepository <ComprasEntity, Long>{
	
}
