package Tcs;

import java.util.ArrayList;
import java.util.Scanner;

public class ES {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerInt = new Scanner(System.in);

        leer.useDelimiter("\n");
        inserte_Locacion("First Floor");

        System.out.println("INTRODUZCA EL ID DE LA NUEVA TIENDA :");
        int store_id = leerInt.nextInt();
        System.out.println(store_id);

        System.out.println("Nombre:");
        String nombre_de_la_tienda = leer.next();
        System.out.println(nombre_de_la_tienda);

        System.out.println("Locacion:");
        String location = leer.next();
        System.out.println(location);

        String n1 = "First Floor";
        String n2 = "Second Floor";
        String n3 = "Third floor";

        boolean l_existe = false;

        while (l_existe == false) {

            if (location.equalsIgnoreCase(n1)) {
                System.out.println("");
                l_existe = true;
                break;
            } else if (location.equalsIgnoreCase(n2)) {
                System.out.println("");
                l_existe = true;
                break;
            }
            if (location.equalsIgnoreCase(n3)) {
                System.out.println("");
                l_existe = true;
                break;
            } else {
                System.out.println("Locacion No admitida");
                break;
            }

        }
    }

    public static void inserte_Locacion(String loc) {
        String n1 = "First Floor";
        String n2 = "Second Floor";
        String n3 = "Third floor";

        if (loc.equalsIgnoreCase(n1))
            System.out.println("Se agreco correctamente");
        else if (loc.equalsIgnoreCase(n2))
            System.out.println("Se agreco correctamente");
        else if (loc.equalsIgnoreCase(n3))
            System.out.println("Se agreco correctamente");
        else
            System.out.println("Locacion No admitida");

    }
}
