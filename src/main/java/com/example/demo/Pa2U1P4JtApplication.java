package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.uce.edu.modelo.Estudiante;
import com.example.demo.service.uce.edu.EstudianteService;

@SpringBootApplication
public class Pa2U1P4JtApplication implements CommandLineRunner {


	@Autowired
	private EstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Toscano");
		miEstudiante.setCedula("1724693740");
		miEstudiante.setNombre("Juan");
		miEstudiante.setFecha(LocalDateTime.of(1996, 9, 13, 22, 02));
		
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Cayambe");
		estudiante2.setCedula("1724694520");
		estudiante2.setNombre("Edison");
		estudiante2.setFecha(LocalDateTime.of(1982, 10, 1, 16, 54));
		
		//1. guradar
		estudianteService.guardar(estudiante2);
		estudianteService.guardar(miEstudiante);
		
		//5. reporte
		
		 List<Estudiante> reporte = this.estudianteService.reporteDeTodos();
		 
		 System.out.println("Reporte");
		 
		 for(Estudiante estudiante: reporte) {
			 System.out.println(estudiante);
		 }
		
		 //2. actualizar
		 estudiante2.setApellido("Coloma");
		 this.estudianteService.actualizar(estudiante2);
		
         List<Estudiante> reporte2 = this.estudianteService.reporteDeTodos();
		 
		      System.out.println("Reporte");
		 
		      for(Estudiante estudiante: reporte2) {
			      System.out.println(estudiante);
		 }
		      
		  //4. Eliminar
		      
		  this.estudianteService.borrar("1724694520");    
		  
		  List<Estudiante> reporte3 = this.estudianteService.reporteDeTodos();
			 
	      System.out.println("Reporte");
	 
	      for(Estudiante estudiante: reporte3) {
		      System.out.println(estudiante);
		      
		      
		  //buscar por cedula, busqueda de una cedula no existente
		      Estudiante miEstudiante1 = this.estudianteService.buscarPorCedula("1724693740");
		      Estudiante miEstudiante2 = this.estudianteService.buscarPorCedula("17246");
		      
		      System.out.println(miEstudiante1);
		      System.out.println(miEstudiante2);
	 } 
		      
	}

	
}
