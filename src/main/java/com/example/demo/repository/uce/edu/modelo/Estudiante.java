package com.example.demo.repository.uce.edu.modelo;

import java.time.LocalDateTime;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDateTime fecha;
	
	
	
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fecha=" + fecha
				+ "]";
	}
	
	//get and set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	
}
