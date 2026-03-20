package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("----- BIENVENIDO -----");
            System.out.println("1. Retiro sin tarjeta");
            System.out.println("2. Transaccion");
            System.out.println("3. Cambiar pin");
            System.out.println("4. Retiro");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            if (num < 1 || num > 4){
                System.out.println("Ingrese un numero valido");
                continue;
            }


        }
    }
}
