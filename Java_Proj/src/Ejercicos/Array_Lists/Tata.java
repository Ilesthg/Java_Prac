package Ejercicos.Array_Lists;

public class Tata {
    public static void main(String[] args) {

        int x = 10;
        int suma = 0;

        while (x > 3) {
            suma += x;
            x = x - 2;
        }
        System.out.println(suma);
    }
}
