package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRep;
import com.example.demo.repository.modelo.Materia;

@Service
public class MateriaServImpl implements IMateriaServ{

	@Autowired
	private IMateriaRep materiaRep;

	@Override
	public void guardar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRep.insertar(materia);
	}

	@Override
	public void actulizar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRep.actulizar(materia);
	}
	
	
	
}
