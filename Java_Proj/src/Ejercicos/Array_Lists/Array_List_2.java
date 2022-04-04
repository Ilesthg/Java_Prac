package Ejercicos.Array_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_2 {
    //static int numero_alumnos = 5;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //VARIABLES CREADAS PARA ASIGNARLAS A LOS PARAMETROS DE LOS METODOS
        ArrayList<Integer> valores = new ArrayList<>();
        Integer n;
        int media;

        n = numeroAlumnos();// COMO DEVUELVE UN VALORE EL METODO SE LE ASIGNA A LA VARIABLE CREADA n

        leerValoresArrary(valores, n);
        media = calcularMedia(valores);
        mostrarResultados(valores, media);

    }

    //ESTE METODO DEVULVE UN NUMERO DE CUANTOS ALUMNOS HABRA
    private static int numeroAlumnos() {
        int n;
        do {
            System.out.println("INGRESE CUANTOS ALUMNOS HABRA");
            n = leer.nextInt();
        } while (n < 1);
        return n;
    }

    public static void leerValoresArrary(ArrayList<Integer> a, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el valor del array en la posicion : " + (i + 1));
            int num = leer.nextInt();
            a.add(num);
        }
    }

    public static void mostrarResultados(ArrayList<Integer> a, double media) {
        System.out.println("Los valores contenidos en el array son : ");
        System.out.println(a);
        int superior = 0;
        int inferior = 0;
        double suma = 0;
        double promedio;
        for (int i = 0; i < a.size(); i++) {
            suma = suma + a.get(i);
            if (a.get(i) > media) {
                superior++;
            } else {
                inferior++;
            }
        }
        promedio = suma / a.size();

        System.out.println(suma);
        System.out.println(promedio);
        System.out.println(media);
        System.out.println("HAY TANTOS superiores: " + superior);
        System.out.println("HAY TANTOS: inferiores" + inferior);
    }

    public static int calcularMedia(ArrayList<Integer> a) {
        int media = 0;
        for (Integer datos : a) {
            media = media + datos;
        }
        return media / a.size();
    }

}
