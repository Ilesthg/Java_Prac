package Ejercicos.Array_Lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list3 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        leerArrays(valores);
    }

    public static void leerArrays(ArrayList<Integer> a) {
        //De cuanto sera el tamaño del arraylist

        System.out.println("Dame el tamaño del array");
        int n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dame el valor " + (i + 1) + ":");
            int valor = leer.nextInt();
            a.add(valor);
        }
        int suma = 0;
        for (int i = 0; i < a.size(); i++) {
            suma = suma + a.get(i);
        }
        System.out.println(suma);
    }

}
