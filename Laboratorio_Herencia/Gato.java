package Laboratorio_Herencia;


public class Gato extends Animal{      
    
    String Caracteristica;
    String Vision;
    int num_garras;
    

    public Gato(String Caracteristica, String Vision, int num_garras, String nombre, String tipo, String genero, String sonido) {
        super(nombre, tipo, genero, sonido);
        this.Caracteristica = Caracteristica;
        this.Vision = Vision;
        this.num_garras = num_garras;
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

    public int getNum_garras() {
        return num_garras;
    }

    public void setNum_garras(int num_garras) {
        this.num_garras = num_garras;
    }
    
    
 
}
