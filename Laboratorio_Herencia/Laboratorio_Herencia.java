package Laboratorio_Herencia;

public class Laboratorio_Herencia {
// MAIN
    public static void main(String[] args) {
        
        Animal ani1 = new Animal ("Azucar", "Perro", "Macho", "Guau" );
        Animal ani2 = new Animal ("Carla", "Gato", "Hembra", "Miau");
        
        
        System.out.println("El nombre del animal 1 es: " + ani1.getNombre());
        System.out.println("El tipo del animal 1 es: " +ani1.getTipo());
        System.out.println("El genero del animal 1 es: " +ani1.getGenero());
        System.out.println("El sonido del animal 1 es: " +ani1.getSonido());
        
        System.out.println("-------------------------");
        
        System.out.println("El nombre del animal 2 es: " + ani2.getNombre());
        System.out.println("El tipo del animal 2 es: " +ani2.getTipo());
        System.out.println("El genero del animal 2 es: " +ani2.getGenero());
        System.out.println("El sonido del animal 2 es: " +ani2.getSonido());
        
        
        
    }
}
