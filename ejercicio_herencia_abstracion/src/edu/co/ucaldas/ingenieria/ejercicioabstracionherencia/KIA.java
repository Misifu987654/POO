package edu.co.ucaldas.ingenieria.ejercicioabstracionherencia;

public class KIA extends Carro{

    int puertas;
    int llantas;
    int faros;

    public KIA(int puertas, int llantas, int faros, String marca, String color, int kilometraje) {
        super(marca, color, kilometraje);
        this.puertas = puertas;
        this.llantas = llantas;
        this.faros = faros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getFaros() {
        return faros;
    }

    public void setFaros(int faros) {
        this.faros = faros;
    }

  }
    
    
    
    
        

   
    
    
    
    
    
    
    
    

