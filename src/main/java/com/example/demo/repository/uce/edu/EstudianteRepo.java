package com.example.demo.repository.uce.edu;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

public interface EstudianteRepo {

	public void insertar (Estudiante estudiante);
	public void actualizar (Estudiante estudiante);
	public Estudiante seleccionar (String cedula);
	public void eliminar (String cedula);
}
