package com.example.demo.repository.uce.edu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements EstudianteRepo{

	private static List<Estudiante> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estudiante) {
		
		baseDatos.add(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		
	
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		
		return null;
	}

	@Override
	public void eliminar(String cedula) {
		
		
	}

	
}
