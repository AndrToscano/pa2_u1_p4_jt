package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.uce.edu.repository.modelo.Cuenta;
import com.example.demo.banco.uce.edu.service.CuentaService;
import com.example.demo.banco.uce.edu.service.TransferenciaService;


@SpringBootApplication
public class Pa2U1P4JtApplication implements CommandLineRunner {


	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
	
		//Cuenta 1
	    cuenta1.setCedulaPropietario("1234");
	    cuenta1.setFechaApertura(LocalDateTime.now());
	    cuenta1.setNumero("5678");
	    cuenta1.setSaldo(new BigDecimal(200));
	    cuenta1.setTipo("A");
	    
	    //Cuenta 2
	    cuenta2.setCedulaPropietario("4321");
	    cuenta2.setFechaApertura(LocalDateTime.now());
	    cuenta2.setNumero("8765");
	    cuenta2.setSaldo(new BigDecimal(100));
	    cuenta2.setTipo("A");
	    
	    //Insertar
	    this.cuentaService.guardar(cuenta1);
	    this.cuentaService.guardar(cuenta2);
	    
	    this.transferenciaService.realizar("5678", "8765", new BigDecimal(10));
		
	    System.out.println("Su saldo actual es de: "+
	                       this.cuentaService.buscarNumero("5678").getSaldo());
	    
	    System.out.println("Su saldo destino es de: "+
                this.cuentaService.buscarNumero("8765").getSaldo());
	}

	
}
