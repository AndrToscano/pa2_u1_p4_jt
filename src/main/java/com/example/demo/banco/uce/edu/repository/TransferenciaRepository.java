package com.example.demo.banco.uce.edu.repository;

import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

public interface TransferenciaRepository {

	public void insertar (Transferencia transferencia);
	public void actualizar (Transferencia transferencia);
	public void eliminar (String numero);
	public Transferencia seleccionarNumero (String numero);
	
}
