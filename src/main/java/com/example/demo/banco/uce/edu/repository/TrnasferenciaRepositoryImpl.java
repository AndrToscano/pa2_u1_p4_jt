package com.example.demo.banco.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

@Repository
public class TrnasferenciaRepositoryImpl  implements TransferenciaRepository{

	private static List<Transferencia> baseDatos = new ArrayList<>();	
	
	@Override
	public void insertar(Transferencia transferencia) {
		
		baseDatos.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		
		Transferencia transferencia = this.seleccionarNumero(numero);
		baseDatos.remove(transferencia);
		
	}

	@Override
	public Transferencia seleccionarNumero(String numero) {
		
		Transferencia transferenciaEncontrado = new Transferencia();
		
		for (Transferencia transferencia: baseDatos) {
			if(numero.equals(transferencia.getNumero())) {
				
				transferenciaEncontrado = transferencia;
			}
		}
		return transferenciaEncontrado;
	}

	@Override
	public List<Transferencia> reporteTransferencia() {
		
		return baseDatos;
	}
	
	

}
