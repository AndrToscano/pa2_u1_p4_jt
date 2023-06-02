package com.example.demo.banco.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.uce.edu.repository.TransferenciaRepository;
import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService{

	@Autowired
	private TransferenciaRepository transferenciaRepository;
	
	@Override
	public void guardar(Transferencia transferencia) {
		
		this.transferenciaRepository.insertar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
	
       this.transferenciaRepository.actualizar(transferencia);		
	}

	@Override
	public void borrar(String numero) {
		
		this.transferenciaRepository.eliminar(numero);
		
	}

	@Override
	public Transferencia buscarNumero(String numero) {
		
		return this.transferenciaRepository.seleccionarNumero(numero);
	}

}
