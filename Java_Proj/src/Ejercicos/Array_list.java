package Ejercicos;

import java.util.ArrayList;
import java.util.List;

public class Array_list {

    public static void main(String[] args) throws Exception {

        ArrayList<String> meses = new ArrayList<>();

        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        System.out.println(meses);

        imprimir_arraylist(meses);

        //RECIBE UNA COLECCION DE OBJETOS GENERICOS 
        List lista = new ArrayList<>();

        lista.add(15);
        lista.add(2.5);
        lista.add("hola crayola");

        System.out.println(lista);
        for (Object object : lista) {

        }

    }

    public static void imprimir_arraylist(ArrayList<String> meses) {
        for (String datos : meses) {
            System.out.println(datos);
        }
    }
}
