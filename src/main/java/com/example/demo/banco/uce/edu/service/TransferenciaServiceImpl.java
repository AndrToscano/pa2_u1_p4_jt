package com.example.demo.banco.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.uce.edu.repository.CuentaRepository;
import com.example.demo.banco.uce.edu.repository.TransferenciaRepository;
import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;
import com.example.demo.banco.uce.edu.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService{

	@Autowired
	private TransferenciaRepository transferenciaRepository;
	
	@Autowired
	private CuentaRepository cuentaRepository;
	
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

	@Override
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		//1. consultar el saldo de la cuenta origen
		
		Cuenta cuentaOrigen = cuentaRepository.seleccionarNumero(numeroCuentaDestino);

		//2. Consultar el saldo de la cuenta origen
		
		BigDecimal saldoOrigen = cuentaOrigen.getSaldo();
		
		//3. Validar si el saldo es suficiente
		if(monto.compareTo(saldoOrigen) <= 0) {
			 //5. Si es suficiente ir al paso 6
		     //6. Realizar la resta del saldo origen - monto
			
			BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		    
			//7. Actualizar el nuevo saldo de la cuenta origen
			
			cuentaOrigen.setSaldo(nuevoSaldoOrigen);
		    
			//8. Consultamos la cuenta de destino por el numero
			
			Cuenta cuentaDestino = cuentaRepository.seleccionarNumero(numeroCuentaOrigen);
		     
			//9. Consultamos el saldo de la cuenta destino
			
			BigDecimal saldoDestino = cuentaDestino.getSaldo();
		    
			//10. realizamos la suma del saldo destino + monto
			
			BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		
		//11. Actualizamos el nuevo saldo de la cuenta deestino
		cuentaDestino.setSaldo(nuevoSaldoDestino);
		this.cuentaRepository.actualizar(cuentaDestino);

		//12. Creamos la transferencia
		Transferencia transferencia = new Transferencia();
		transferencia.setCuentaOrigen(cuentaOrigen);
		transferencia.setCuentaDestino(cuentaDestino);
		transferencia.setMonto(monto);
		Double numero = Math.random();
		transferencia.setNumero(numero.toString());
		transferencia.setFecha(LocalDateTime.now());
		this.transferenciaRepository.insertar(transferencia);
		}
		
		else {
			//4. Si no es suficiente imprimir mensaje de que no hay saldo
			System.out.println("Su saldo no es sificiente, su saldo es de: "+
			                    saldoOrigen);
		}
		     
		    
	}
	
	

}
