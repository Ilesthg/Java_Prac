package Inheritance.UI_USER_INTERFACE;

import javax.swing.JOptionPane;

import Inheritance.Models.Peliculas_Model.ICatalogo_Peliculas;
import Inheritance.Models.Peliculas_Model.Implementacion_Pelicula;
import Inheritance.Models.Peliculas_Model.Peliculas;

public class UI_Peliculas {

    public static void interfaz_usuario() {

        ICatalogo_Peliculas peliculas = new Implementacion_Pelicula();
        Peliculas pelicula;

        CERRAR: while (true) {
            String opcion = JOptionPane.showInputDialog(null, "1-INSERTAR PELICULA\n"
                    + "2 -LISTAR pelicula\n"
                    + "3-Buscar pelicula"
                    + "4- salir", "Catalogo Pelicuals", 3);

        }

    }
}
