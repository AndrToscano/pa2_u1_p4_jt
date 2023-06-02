package com.example.demo;

public class MateriaExtraordinaria {
	
	private String nonbre;
	private Integer cantidadCreditos;
	
	
	
	@Override
	public String toString() {
		return "MateriaExtraordinaria [nonbre=" + nonbre + ", cantidadCreditos=" + cantidadCreditos + "]";
	}
	//get and set
	public String getNonbre() {
		return nonbre;
	}
	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}
	public Integer getCantidadCreditos() {
		return cantidadCreditos;
	}
	public void setCantidadCreditos(Integer cantidadCreditos) {
		this.cantidadCreditos = cantidadCreditos;
	}
	
	
	

}
