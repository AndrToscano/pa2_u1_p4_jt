package com.example.demo.banco.uce.edu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.uce.edu.repository.CuentaRepository;
import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService{

	@Autowired
	private CuentaRepository cuentaRepository;
	@Override
	public void guardar(Cuenta cuenta) {
		
		this.cuentaRepository.insertar(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		
		this.cuentaRepository.actualizar(cuenta);
	}

	@Override
	public void borrar(String numero) {
		
		this.cuentaRepository.eliminar(numero);
	}

	@Override
	public Cuenta buscarNumero(String numero) {
		
		return this.cuentaRepository.seleccionarNumero(numero);
	}

	
	
}
