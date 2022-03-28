package Ejercicos;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(5));
        System.out.println(factorial3(5));
        System.out.println(fact(5));

    }

    static int fact(int numero) {
        int fac = 1;
        for (int i = 1; i <= numero; i++) {
            fac = fac * i;
        }
        return fac;
    }

    static int factorial(int numero) {
        int fac = 1;
        while (numero > 1) {

            fac = fac * numero;
            numero--;
        }
        return fac;
    }

    static long factorial2(int numero) {
        long factorial = 1;
        while (numero > 1) {
            factorial = factorial * numero;
            numero--;
        }
        return factorial;
    }

    static int factorial3(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial3(numero - 1);
        }

    }
}
