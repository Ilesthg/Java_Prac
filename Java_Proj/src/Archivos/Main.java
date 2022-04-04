package Archivos;

import static Archivos.ManejoArchvios.*;

public class Main {

    public static void main(String[] args) {

        escribirArchvio("C:\\a\\Hola.txt", "HOLA");
        // escribirArchvio("C:\\a\\Hola.txt", "Cratolawb");
        //escribirArchvio("C:\\a\\Hola.txt", "s");
        // escribirArchvio("C:\\a\\Hola.txt", "Cratolawb");

        leerArchivo("C:\\a\\Hola.txt");
        eliminarArchivo("C:\\a\\Hola.txt");
    }
}
