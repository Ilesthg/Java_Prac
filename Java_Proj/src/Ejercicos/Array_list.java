package Ejercicos;

import java.util.ArrayList;

public class Array_list {

    public static void main(String[] args) throws Exception {

        ArrayList<String> meses = new ArrayList<>();

        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        System.out.println(meses);

        imprimir_arraylist(meses);

    }

    public static void imprimir_arraylist(ArrayList<String> meses) {
        for (String datos : meses) {
            System.out.println(datos);
        }
    }
}
