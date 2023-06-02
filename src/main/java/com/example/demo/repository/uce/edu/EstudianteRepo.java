package com.example.demo.repository.uce.edu;

import java.util.List;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

public interface EstudianteRepo {

	public void insertar (Estudiante estudiante);
	public void actualizar (Estudiante estudiante);// se busca por el identificador
	public Estudiante seleccionar (String cedula);// se busca por un identificador
	public void eliminar (String cedula);
	public List<Estudiante> seleccionarTodos();
}
