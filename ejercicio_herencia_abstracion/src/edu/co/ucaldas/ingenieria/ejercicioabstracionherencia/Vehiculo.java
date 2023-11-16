package edu.co.ucaldas.ingenieria.ejercicioabstracionherencia;

public abstract class Vehiculo {

	int kilometrajeRecorrido;
	int kilometrajeTtotal;
	int vehiculosCreados;

	public Vehiculo(int kilometrajeRecorrido, int kilometrajeTtotal, int vehiculosCreados) {
		this.kilometrajeRecorrido = kilometrajeRecorrido;
		this.kilometrajeTtotal = kilometrajeTtotal;
		this.vehiculosCreados = vehiculosCreados;
	}

	public int getKilometrajeRecorrido() {
		return kilometrajeRecorrido;
	}

	public void setKilometrajeRecorrido(int kilometrajeRecorrido) {
		this.kilometrajeRecorrido = kilometrajeRecorrido;
	}

	public int getKilometrajeTtotal() {
		return kilometrajeTtotal;
	}

	public void setKilometrajeTtotal(int kilometrajeTtotal) {
		this.kilometrajeTtotal = kilometrajeTtotal;
	}

	public int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public void setVehiculosCreados(int vehiculosCreados) {
		this.vehiculosCreados = vehiculosCreados;
	}
	
	public abstract void avanzar(int distancia);
	
	


}
