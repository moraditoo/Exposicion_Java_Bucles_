package main;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String Nombre_Cuenta;
        String Password;
        double Saldo;
        int numero_cuenta;
        int pin = 1234;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("--- CREAR CUENTA ---");
            System.out.print("Ingrese un nombre: ");
            Nombre_Cuenta = sc.nextLine();

            System.out.print("Ingrese una contraseña: ");
            Password = sc.nextLine();

            try {
                System.out.print("Ingrese su saldo actual: ");
                Saldo = sc.nextDouble();
                sc.nextLine(); // limpiar buffer
            } catch (Exception e) {
                System.out.println("Ingrese un numero válido");
                sc.nextLine();
                continue;
            }

            Random rand = new Random();
            numero_cuenta = rand.nextInt(90000000) + 10000000;

            System.out.println("Su numero de cuenta asignado es: " + numero_cuenta);
            break;
        }

        while (true) {

            System.out.println("--- Inicio de sesión ---");
            System.out.print("Ingrese su nombre: ");
            String Nombre_Ingresado = sc.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String Password_Ingresada = sc.nextLine();

            if (!Nombre_Ingresado.equals(Nombre_Cuenta) || !Password_Ingresada.equals(Password)) {
                System.out.println("Los datos ingresados son incorrectos, intentelo nuevamente");
                continue;
            }

            break;
        }

        while (true) {
            System.out.println("----- BIENVENIDO -----");
            System.out.println("1. Retiro sin tarjeta");
            System.out.println("2. Transaccion");
            System.out.println("3. Cambiar pin");
            System.out.println("4. Retiro");
            System.out.println("5. Mostrar Saldo");
            System.out.println("6. Salir");

            int num = sc.nextInt();

            if (num < 1 || num > 6) {
                System.out.println("Ingrese un numero valido");
                continue;
            }
            
            if (num == 1) {
                System.out.print("Ingrese monto: ");
                double monto = sc.nextDouble();

                if (monto <= Saldo) {
                    Saldo -= monto;

                    Random rand = new Random();
                    int comprobante = rand.nextInt(900000) + 100000;

                    System.out.println("Retiro exitoso");
                    System.out.println("Número de comprobante: " + comprobante);
                } else {
                    System.out.println("Saldo insuficiente");
                }
            }

            if (num == 2) {
                System.out.print("Ingrese cuenta destino (8 digitos): ");
                String cuenta = sc.next();

                if (cuenta.length() == 8) {
                    System.out.print("Ingrese monto: ");
                    double monto = sc.nextDouble();

                    if (monto <= Saldo) {
                        Saldo -= monto;
                        System.out.println("Transferencia realizada");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                } else {
                    System.out.println("Numero de cuenta invalido");
                }
            }

            if (num == 3) {
                for (int i = 1; i <= 3; i++) {
                    System.out.print("Ingrese PIN actual: ");
                    int intento = sc.nextInt();

                    if (intento == pin) {
                        System.out.print("Ingrese nuevo PIN: ");
                        pin = sc.nextInt();
                        System.out.println("PIN cambiado exitosamente");
                        break;
                    } else {
                        System.out.println("PIN incorrecto");
                    }
                }
            }

            if (num == 4) {
                System.out.print("Ingrese monto: ");
                double monto = sc.nextDouble();

                if (monto <= Saldo) {
                    Saldo -= monto;
                    System.out.println("Retiro exitoso");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            }

            if (num == 5) {
                System.out.println("Su saldo es: " + Saldo);
            }

            if (num == 6) {
                System.out.println("Gracias por usar el sistema");
                break;
            }
        }
    }
}
