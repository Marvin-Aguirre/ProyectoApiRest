package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.compras.ComprasEntity;
import com.example.demo.service.ComprasService;

@Controller
public class ComprasController {
	
	@Autowired
	private ComprasService service;

	@GetMapping("/homepage")
    public String viewHome(Model model) {
        List<ComprasEntity> listshome = service.listAll();
        model.addAttribute("listshome", listshome);
        System.out.print("Get / ");	
        return "home";
    }
	
	@GetMapping("/compras")
	public String viewCompras(Model model) {
		List<ComprasEntity> listscompras = service.listAll();
		model.addAttribute("listscompras", listscompras);
		System.out.print("Get /");
		return "compras";
	}
	
}
