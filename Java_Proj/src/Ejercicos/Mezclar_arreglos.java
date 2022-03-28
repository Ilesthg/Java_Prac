package Ejercicos;

import java.util.Scanner;

public class Mezclar_arreglos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int suma_A = arr1.length + arr2.length;
        int arr3[] = new int[suma_A];

        int A[] = { 1, 2, 3, 4, 5, 6 };
        int B[] = { 4, 5, 6, 7, 8, 9 };
        int C[] = new int[A.length + B.length];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Digite los elementos del Arreglo 1: \n" + "Posicion: " + (i + 1));
            arr1[i] = leer.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Digite los elementos del Arreglo 2: \n" + "Posicion: " + (i + 1));
            arr2[i] = leer.nextInt();
        }

        // LOS PRIMEROS 5 ELEMENTOS DEL 1 ARRAY DESDE 1 HASTA 5
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        // LOS 5 ELEMENTOS DEL 2 ARRAY DESDE 5 HASTA 10
        for (int i = 5; i < arr3.length; i++) {
            arr3[i] = arr2[i - 5];
        }

        for (int i : arr3) {
            System.out.println(i);
        }

        // Mezclar 1 elemenro del 1 array con el 1 elemento del segundo array
        int c = 0;
        for (int i = 0; i < A.length; i++) {
            // 0,2,4, 0,1,2
            C[c] = A[i];
            c++;
            // 1,3,5 0,1,2
            C[c] = B[i];
            c++;
        }

        for (int i : C) {
            System.out.println("AREGLO 6: " + i);
        }

        // arreglo para mezclar amtrices de 3 en 3 o 2 en 2
        int j = 0;
        int i = 0;

        while (i < 6) {
            for (int k = 0; k < 3; k++) {
                // 0,1.........0,1
                C[j] = A[i + k];
                j++;
            }
            for (int k = 0; k < 3; k++) {
                C[j] = B[i + k];
                j++;
            }
            i += 3;
        }

        for (int datos : C) {
            System.out.println(datos);
        }

    }
}
