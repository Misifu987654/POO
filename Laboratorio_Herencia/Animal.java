package Laboratorio_Herencia;

public class Animal {
    
    String nombre;
    String tipo;
    String genero;
    String sonido;

    public Animal() {
    }

    public Animal(String nombre, String tipo, String genero, String sonido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    
    
}
