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
		
		this.eliminar(estudiante.getCedula());
		this.insertar(estudiante);
	
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		Estudiante estudianteEncontrado = new Estudiante();
		
		for(Estudiante estudiante: baseDatos) {
			//Siempre evaluar por le elemento que sabemos no va a ser nulo, 
			//para evitar errores en compilacion
			
			if(cedula.equals(estudiante.getCedula())) {
				estudianteEncontrado = estudiante;
			}
		}
		
		return estudianteEncontrado;
	}

	@Override
	public void eliminar(String cedula) {
		
		Estudiante estudiante = this.seleccionar(cedula);
		baseDatos.remove(estudiante);
		
	}

	@Override
	public List<Estudiante> seleccionarTodos() {
		
		return baseDatos;
	}
	
	

	
}
