package Java_Proj.src.Ejercicos;

import java.util.Scanner;

public class Mayor_Menor_Numeros {
    static int mayor, menor;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Dame el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Cuarto numero: ");
        num4 = entrada.nextInt();

        mayor = num1;
        menor = num1;

        comprobar(num2);
        comprobar(num3);
        comprobar(num4);
        System.out.print("De los 4 numeros dados, el " + menor + " es el menor, el " + mayor
                + " es el mayor. Por lo tanto, los que estan en medio son: ");
        comprobarMedio(num1);
        comprobarMedio(num2);
        comprobarMedio(num3);
        comprobarMedio(num4);
    }

    static void comprobar(int num) {
        if (num < menor)
            menor = num;
        if (num > mayor)
            mayor = num;
    }

    static void comprobarMedio(int num) {
        if (num != menor && num != mayor)
            System.out.print(num + " ");
    }
}