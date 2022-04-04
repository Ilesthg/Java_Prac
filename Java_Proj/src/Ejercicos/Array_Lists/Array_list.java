package Ejercicos.Array_Lists;

import java.util.ArrayList;

public class Array_list {

    public static void main(String[] args) throws Exception {

        ArrayList<String> meses = new ArrayList<>();

        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        //IMPRIMIR EL ARRAYLIST
        System.out.println(meses);
        imprimir_arraylist(meses);

        //3 MANERA DE RECOORER EL ARRAY
        meses.forEach(list -> {
            System.out.println("EL RESULTADO ES: " + list);
        });

    }

    // SEGUNDA MANERDA DE RECORRER EL ARRAY LIST CON METODO
    public static void imprimir_arraylist(ArrayList<String> meses) {
        for (String datos : meses) {
            System.out.println(datos);
        }
    }
}
