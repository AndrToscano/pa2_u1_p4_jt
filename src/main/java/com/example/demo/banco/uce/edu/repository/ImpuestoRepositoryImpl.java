package com.example.demo.banco.uce.edu.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

@Repository
public class ImpuestoRepositoryImpl implements ImpuestoRepository{

	@Override
	public BigDecimal selccionar(String codigoImpuesto) {
	
		return new BigDecimal(12);
	}

}
