package Laboratorio_Herencia;

public class Perro extends Animal{
    
    String Caracteristica;
    String Vision;
    int num_unas;

    public Perro(String Caracteristica, String Vision, int num_unas, String nombre, String tipo, String genero, String sonido) {
        super(nombre, tipo, genero, sonido);
        this.Caracteristica = Caracteristica;
        this.Vision = Vision;
        this.num_unas = num_unas;
    }

    public String getCaracteristica() {
        return Caracteristica;
    }

    public void setCaracteristica(String Caracteristica) {
        this.Caracteristica = Caracteristica;
    }

    public String getVision() {
        return Vision;
    }

    public void setVision(String Vision) {
        this.Vision = Vision;
    }

    public int getNum_unas() {
        return num_unas;
    }

    public void setNum_unas(int num_unas) {
        this.num_unas = num_unas;
    }
    
    
    
}
