package edu.co.ucaldas.ingenieria.ejercicioabstracionherencia;

public class Bicicleta {

	int velocidad;
	String color;
	int cambio;
	float potencia;

	public Bicicleta(int velocidad, String color, int cambio) {
		this.velocidad = velocidad;
		this.color = color;
		this.cambio = cambio;
	}

	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCambio() {
		return cambio;
	}

	public void setCambio(int cambio) {
		this.cambio = cambio;
	}

	public void avanzar(int velocidad) {
		this.potencia += velocidad;
		System.out.println(" El carro ha recorrido " + " kilómetros.");
	}


}
