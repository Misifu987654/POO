package edu.co.ucaldas.ingenieria.ejercicioabstracionherencia;

public class Specialized extends Bicicleta{

	int llantas;
	int numReflectores;
	int numLuces;

	public Specialized(int llantas, int numReflectores, int numLuces, int velocidad, String color, int cambio) {
		super(velocidad, color, cambio);
		this.llantas = llantas;
		this.numReflectores = numReflectores;
		this.numLuces = numLuces;
	}

	public int getLlantas() {
		return llantas;
	}

	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}

	public int getNumReflectores() {
		return numReflectores;
	}

	public void setNumReflectores(int numReflectores) {
		this.numReflectores = numReflectores;
	}

	public int getNumLuces() {
		return numLuces;
	}

	public void setNumLuces(int numLuces) {
		this.numLuces = numLuces;
	}




}