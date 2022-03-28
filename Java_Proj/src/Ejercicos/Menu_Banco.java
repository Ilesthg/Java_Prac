package Ejercicos;

import java.util.Scanner;

public class Menu_Banco {

    public static void main(String[] args) {
        int saldoIncial = 1000;
        int saldoActual = 0;
        boolean salir = false;
        Integer opcion;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("INGRESE UNA DE LAS OPCIONES \n"
                    + "1.- INGRESAR DINERO A LA CUENTA\n"
                    + "2.-RETIRAR DINERO DE LA CUENTA \n"
                    + "3.-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESE CUANTO DINERO INGRESARA");
                    int dinero = leer.nextInt();
                    saldoIncial = saldoIncial + dinero;
                    saldoActual = saldoIncial;
                    System.out.println("SUSALDO ACTUAL ES DE : " + saldoActual);
                    break;
                case 2:
                    System.out.println("INGRESE CUANTO DINERO Retirara");
                    int saldoRetirar = leer.nextInt();
                    if (saldoRetirar > saldoActual) {
                        System.out.println("No cuenta con el dinero suficiente");
                    } else {
                        saldoActual = saldoActual - saldoRetirar;
                        System.out.println(saldoActual);
                    }
                    break;
                case 3:

                    break;

                default:
                    System.out.println("no seas tonto main ");
                    break;
            }
        } while (opcion != 3);

    }

}
