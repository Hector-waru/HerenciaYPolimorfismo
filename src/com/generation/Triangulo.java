package com.generation;

public class Triangulo extends FiguraGeometrica {
	//Constructor
	public Triangulo() {
		super("Triangulo");//apenas los cree ya tienen nombre
	}
	//Polimorfismo
	//
	@Override 
	public float calcularArea() {
		return (alto * largo)/2;
	}
	
}
