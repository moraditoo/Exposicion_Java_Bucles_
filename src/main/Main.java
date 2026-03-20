package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String Nombre_Cuenta;
        String Password;
        double Saldo;
        int numero_cuenta;
        
        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("--- CREAR CUENTA ---");
            System.out.print("Ingrese un nombre: "); Nombre_Cuenta = sc.nextLine();
            System.out.print("Ingrese una contraseña: "); Password = sc.nextLine();

            try{

                System.out.print("Ingrese su saldo actual: "); Saldo = sc.nextInt();

            } catch (Exception e) {

                System.out.println("Ingrese un numero válido");
                continue;

            }

            Random rand = new Random();
            numero_cuenta = rand.nextInt(90000000) + 10000000;

            System.out.println("Su numero de cuenta asignado es: " + numero_cuenta);

            break;
        }

        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("--- Inicio de sesión ---");
            System.out.print("Ingrese su nombre: "); String Nombre_Ingresado = sc.nextLine();
            System.out.print("Ingrese su contraseña: "); String Password_Ingresada = sc.nextLine();
            
            if (Nombre_Ingresado != Nombre_Cuenta || Password_Ingresada != Password){
                System.out.println("Los datos ingresados son incorrectos, intentelo nuevamente");
                continue;
            }

            break;
        }
        
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
