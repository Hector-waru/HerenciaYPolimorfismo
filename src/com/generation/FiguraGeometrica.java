package com.generation;

public class FiguraGeometrica {
	//Se agrega un modificador de acceso para estos atributos- Lo habia hecho con protected - de private a protected
	private String nombre;
	protected float alto;
	protected float largo;
	//constructor - nos obliga darle un nombre
	public FiguraGeometrica(String nombre) {
		this.nombre=nombre;
	}
	//Getters y setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setAlto(float alto) {
		this.alto=alto;
		
	}
	public void setLargo(float largo) {
		this.largo=largo;
	}
	// * * * ** ** * * *** **** * * * ** ** * ***  * * * ** * ** 
	public float getLargo() {
		return this.largo;
	}
	public float getAlto() {
		return this.alto;
		
	}
	public String getNombre() {
		return this.nombre;
	}
	// **** * * * ** *  ** * * ** * * * * * * * **  ** * * ** * * **    * * * ** * *
	public float calcularArea() {
		return alto * largo;
	}
	
}
