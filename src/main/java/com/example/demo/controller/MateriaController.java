package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaServ;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	@Autowired
	private IMateriaServ materiaServ;
	
	//insertar[ http://localhost:8081:/uce/materias/nuevo
	
	@GetMapping("/nuevo")
	public String pagNuevaMateria() {
		return "vGuardarMateria";
	}
	
	@PostMapping("/guardar")
	public String guardarMateria(Materia materia) {
		this.materiaServ.guardar(materia);
		return "redirect:/materias/nuevo";
	}
	//]

}
