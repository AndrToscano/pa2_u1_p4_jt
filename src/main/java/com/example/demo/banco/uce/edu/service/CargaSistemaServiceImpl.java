package com.example.demo.banco.uce.edu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.uce.edu.repository.ImpuestoRepository;
import com.example.demo.banco.uce.edu.repository.modelo.Impuesto;

@Service
public class CargaSistemaServiceImpl implements CargaSistemaService{

	@Autowired
	private Impuesto impuesto;
	
	@Autowired
	private ImpuestoRepository impuestoRepository;
	
	@Override
	public void cargar() {
		
		System.out.println("Inicia la carga de impuestos: ");
		BigDecimal valorIva = this.impuestoRepository.selccionar("IVA");
		this.impuesto.setSalario(valorIva);
		System.out.println("Fin de la carga de impuestos");
	}

}
