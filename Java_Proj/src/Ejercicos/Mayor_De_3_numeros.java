package Ejercicos;

import java.util.Scanner;

public class Mayor_De_3_numeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int mayor = 0;
        System.out.println("Dme 1 numero");
        int num1 = leer.nextInt();
        System.out.println("Dme otro numero");
        int num2 = leer.nextInt();
        System.out.println("Dme otro numero");
        int num3 = leer.nextInt();

        if (num1 > num2 && num1 > num3) {
            mayor = num1;

        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else if (num3 > num1 && num3 > num2) {
            mayor = num3;
        }

        int[] array1 = { 1, 2, 3, 4 };
        int mayor1 = array1[0];
        int menor1 = array1[0];
        int suma = 0;
        for (int i = 0; i < array1.length; i++) {
            suma += array1[i];
            if (array1[i] > mayor1) {
                mayor1 = array1[i];
            }
            if (array1[i] < menor1) {
                menor1 = array1[i];
            }

        }
        System.out.println("El mayor es " + mayor1);
        System.out.println("El menor es " + menor1);
        System.out.println("LA SUMA ES: " + suma);

        if (num1 > num2 && num2 > num3) {
            System.out.println("El mayor es : " + num1 + "El de en medio es : " + num2 + " y el menor es: " + num3);

        } else if (num1 > num3 && num3 > num2) {
            System.out.println("El mayor es : " + num1 + "El de en medio es : " + num3 + " y el menor es: " + num2);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println("El mayor es : " + num2 + "El de en medio es : " + num1 + " y el menor es: " + num3);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println("El mayor es : " + num2 + "El de en medio es : " + num3 + " y el menor es: " + num1);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println("El mayor es : " + num3 + "El de en medio es : " + num1 + " y el menor es: " + num2);
        } else {
            System.out.println("El mayor es : " + num3 + "El de en medio es : " + num2 + " y el menor es: " + num1);
        }

        System.out.println("EL MAYOR ES : " + mayor);

    }
}
