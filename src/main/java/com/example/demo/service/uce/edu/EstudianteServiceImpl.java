package com.example.demo.service.uce.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.uce.edu.EstudianteRepo;
import com.example.demo.repository.uce.edu.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	//logica del negocio
	@Autowired
    private EstudianteRepo estudianteRepo;
	
	@Override
	public void guardar(Estudiante estudiante) {
		
		estudianteRepo.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		
		estudianteRepo.actualizar(estudiante);
		
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		
		return estudianteRepo.seleccionar(cedula);
	}

	@Override
	public void borrar(String cedula) {
		
		estudianteRepo.eliminar(cedula);
	}

	@Override
	public List<Estudiante> reporteDeTodos() {
	
		return estudianteRepo.seleccionarTodos();
	}

}
