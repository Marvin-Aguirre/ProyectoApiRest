package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.facturacion.FacturacionEntity;
import com.example.demo.service.FacturacionService;

@Controller
public class FacturacionController {
	
	@Autowired
	private FacturacionService service;
	
	@GetMapping("/homepage1")
    public String viewHome(Model model) {
        List<FacturacionEntity> listshome = service.listAll();
        model.addAttribute("listshome", listshome);
        System.out.print("Get / ");	
        return "home";
    }
	
	@GetMapping("/facturacion")
	public String viewCompras(Model model) {
		List<FacturacionEntity> listsfacturas = service.listAll();
		model.addAttribute("listsfacturas", listsfacturas);
		System.out.print("Get /");
		return "facturacion";
	}

}
