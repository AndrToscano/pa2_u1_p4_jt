package com.example.demo.banco.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;

@Repository
public class CuentaRepositoryImpl  implements CuentaRepository{

	private static List<Cuenta> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Cuenta cuenta) {
		
		baseDatos.add(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
	
		this.eliminar(cuenta.getNumero());
		this.insertar(cuenta);
	}

	@Override
	public void eliminar(String numero) {
		
		Cuenta cuenta = this.seleccionarNumero(numero);
		baseDatos.remove(cuenta);
	}

	@Override
	public Cuenta seleccionarNumero(String numero) {
		
		Cuenta cuentaEncontada = new Cuenta();
		for(Cuenta cuenta: baseDatos) {
		
			if(numero.equals(cuenta.getNumero())) {
			cuentaEncontada = cuenta;
			
	      	}
		}	
		return cuentaEncontada;
	}

}
