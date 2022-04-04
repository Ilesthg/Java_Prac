package Inheritance.UI_USER_INTERFACE;

import javax.swing.JOptionPane;

import Inheritance.Models.Peliculas_Model.*;

public class UI_Peliculas {

    public static void interfaz_usuario() {

        ICatalogo_Peliculas peliculas = new Implementacion_Pelicula();
        Peliculas pelicula;

        CERRAR: while (true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "1-INSERTAR PELICULA\n"
                            + "2 -LISTAR pelicula\n"
                            + "3-Buscar pelicula\n"
                            + "4- salir",
                    "Catalogo Pelicuals", 3);

            int num = 0;
            num = Integer.parseInt(opcion);

            switch (opcion) {
                case "1":
                    String nombrepelicula = JOptionPane.showInputDialog(null, "Ingrese la pelicula", "Entrada", 3);
                    pelicula = new Peliculas(nombrepelicula);// Convertir el string que recibimos a un objeto tipo peliculas
                    peliculas.insertar_peliculas(pelicula);
                    break;
                case "2":
                    peliculas.listar_peliculas();
                    break;
                case "3":
                    nombrepelicula = JOptionPane.showInputDialog(null, "Ingrese la pelicula", "Ingrese", 3);
                    //pelicula = new Peliculas(nombrepelicula);
                    peliculas.buscar_peliculas(nombrepelicula);
                    break;
                case "4":
                    break CERRAR;

                default:
                    JOptionPane.showMessageDialog(null, "INgrese una opcion valida", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }

        }

    }
}
