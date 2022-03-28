package Ejercicos;

public class Suma_numeros_con_arg_infinitos {

    static int suma_de_numeros(int a, int b) {
        return a + b;
    }

    static int suma_de_numeros_inf_params(int... numeros) {
        int suma = 0;
        for (int i : numeros) {
            suma += i;
        }
        return suma;
    }

    static String suma_de_strings_inf_params(String... str) {
        String cadenas_con = "";
        for (String i : str) {
            cadenas_con = cadenas_con + " " + i;
        }
        return cadenas_con;
    }

    public static void main(String[] args) {
        System.out.println(suma_de_numeros_inf_params(5, 10, 5, 10));
        System.out.println(suma_de_strings_inf_params("hUGO", "ASDASD", "PEDROCLEA"));
        System.out.println(suma_de_numeros(5, 6));
    }
}