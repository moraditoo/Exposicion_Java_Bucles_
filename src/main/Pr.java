package main;

import java.util.Scanner;

public class Pr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----- BIENVENIDO -----");
            System.out.println("1. Retiro sin tarjeta");
            System.out.println("2. Transaccion");
            System.out.println("3. Cambiar pin");
            System.out.println("4. Retiro");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("Ingrese el numero de cuenta: ");
                    int cuenta = sc.nextInt();
                    System.out.println("Procesando retiro sin tarjeta para cuenta: " + cuenta);
                    break;

                case 2:
                    System.out.println("Has seleccionado Transaccion");
                    break;

                case 3:
                    System.out.print("Ingrese nuevo PIN: ");
                    int pin = sc.nextInt();
                    System.out.println("PIN cambiado correctamente");
                    break;

                case 4:
                    System.out.println("Has seleccionado Retiro");
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    return; // termina el programa

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

            System.out.println(); // espacio
        }
    }
}