package edu.co.ucaldas.ingenieria.ejercicioabstracionherencia;

import java.util.Scanner;

public class TestVehiculo {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        Carro carro = new Carro();

        int opcion;
        do {
            mostrarMenu();
            opcion = in.nextInt();
            ejecutarOpcion(opcion, bicicleta, carro);
        } while (opcion != 8);

        in.close();
    }

    private static void ejecutarOpcion(int opcion, Bicicleta bicicleta, Carro carro) {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarMenu() {
        System.out.println("Menú\n" +
                "1. Andar en bicicleta\n" +
                "2. Andar con el carro\n" +
                "3. Ver kilometraje de la bicicleta\n" +
                "4. Ver kilometraje del carro\n" +
                "5. Ver kilometraje total\n" +
                "6. Ver vehículos creados\n" +
                "7. Verificar tipos de vehículos\n" +
                "8. Salir");
        System.out.print("Elige una opción (1-8): ");
    }

    private static void ejecutarOpcion(int opcion, Vehiculo bicicleta, Vehiculo carro) {
        switch (opcion) {
            case 1:
                bicicleta.avanzar(10);
                break;
            case 2:
                carro.avanzar(10);
                break;
            case 3:
                System.out.println("Los kilometros recorridos por la bicicleta son:" + bicicleta.getKilometrajeRecorrido());
                break;
            case 4:
                System.out.println("Los kilometros recorridos por el carro son:" + carro.getKilometrajeRecorrido());
                break;
            case 5:
                System.out.println("Los kilometros totales recorridos por todos los vehículos son:");
                break;
            case 6:
                System.out.println("El total de vehículos creados es:");
                break;
            case 7:
                System.out.println("Tipos de vehículos creados:\nBicicletas: ");
                break;
            case 8:
                System.out.println("Vuelve pronto!");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

}
