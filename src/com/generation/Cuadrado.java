package com.generation;
// clase hijo extends Clase PADRE
public class Cuadrado extends FiguraGeometrica{
	//constructor hijo
	public Cuadrado() {
		super("Cuadrado");
		//constructor padre pide parametros
		//acceder al constructor padre - llama al padre y por eso todas las figuras son cuadradas
	}
}
