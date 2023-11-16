package edu.co.ucaldas.ingenieria.ejercicioabstracionherencia;

public class Carro {

	String marca;
	String color;
	int kilometraje;
	float potencia;

	public Carro(String marca, String color, int kilometraje) {
		this.marca = marca;
		this.color = color;
		this.kilometraje = kilometraje;
	}

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public void avanzar(int velocidad) {
		this.potencia += velocidad;
		System.out.println(" El carro ha recorrido " + " kilómetros.");
	}


}
