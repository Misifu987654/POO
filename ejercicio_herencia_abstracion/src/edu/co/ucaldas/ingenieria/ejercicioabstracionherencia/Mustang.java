package edu.co.ucaldas.ingenieria.ejercicioabstracionherencia;

public class Mustang extends Vehiculo{
    
    String caracteristicas;
    String faros;
    String tunning; 

    
    public Mustang(String caracteristicas, String faros, String tunning, int kilometrajeRecorrido, int kilometrajeTtotal, int vehiculosCreados) {
        super(kilometrajeRecorrido, kilometrajeTtotal, vehiculosCreados);
        this.caracteristicas = caracteristicas;
        this.faros = faros;
        this.tunning = tunning;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getFaros() {
        return faros;
    }

    public void setFaros(String faros) {
        this.faros = faros;
    }

    public String getTunning() {
        return tunning;
    }

    public void setTunning(String tunning) {
        this.tunning = tunning;
    }

	@Override
	public void avanzar(int distancia) {
		// TODO Auto-generated method stub
		
	}
    
    
    
    
    
    
}
