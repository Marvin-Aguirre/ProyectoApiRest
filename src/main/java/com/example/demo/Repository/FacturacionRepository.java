package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.facturacion.FacturacionEntity;

public interface FacturacionRepository extends JpaRepository <FacturacionEntity, Long>{

}
