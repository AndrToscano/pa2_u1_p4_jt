package com.example.demo;

public class MatriculaCalculo {

	// Programacion Tradicional (fuertemente acoplado)
	/*
	public void realizarCalculo(String tipo) {
		
		if(tipo.equals("1")) {
			
			Materia materia = new Materia();
			
			materia.setNombre("P. Web");
		}
		
		else {
			MateriaExtraordinaria materiaExtraordinaria = new MateriaExtraordinaria();
			
			materiaExtraordinaria.setNonbre("p. Web");
			materiaExtraordinaria.setCantidadCreditos(10);
			
			//insertar la base
			
			System.out.println("Se inserto materia extraordinaria");
		}
	}
	*/
	
    // componentes  
	public void realizarCalculo(String tipo) {
		
		if(tipo.equals("1")) {
			
			Materia materia = new Materia();
			
			materia.setNombre("P. Web");
			
			System.out.println("Se inserto materia ");
		}
		
		else {
			MateriaExtraordinaria materiaExtraordinaria = new MateriaExtraordinaria();
			
			materiaExtraordinaria.setNonbre("p. Web");
			materiaExtraordinaria.setCantidadCreditos(10);
			
			//insertar la base
			
			System.out.println("Se inserto materia extraordinaria");
		}
	}
}
