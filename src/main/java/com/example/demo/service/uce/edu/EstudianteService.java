package com.example.demo.service.uce.edu;

import java.util.List;

import com.example.demo.repository.uce.edu.modelo.Estudiante;

public interface EstudianteService {

	public void guardar (Estudiante estudiante);
	public void actualizar (Estudiante estudiante);// se busca por el identificador
	public Estudiante buscarPorCedula (String cedula);// se busca por un identificador
	public void borrar (String cedula);
	public List<Estudiante> reporteDeTodos();
}
