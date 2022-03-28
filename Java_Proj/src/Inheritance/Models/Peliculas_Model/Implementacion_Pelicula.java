package Inheritance.Models.Peliculas_Model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Implementacion_Pelicula implements ICatalogo_Peliculas {

    private final ArrayList<String> listaPeliculas;

    /*
    public Implementacion_Pelicula(ArrayList<String> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }
    */
    public Implementacion_Pelicula() {
        this.listaPeliculas = new ArrayList<>();
    }

    @Override
    public void buscar_peliculas(Peliculas nomPelicula) {
        String resultado = null;
        for (var pelicula : this.listaPeliculas) {
            if (pelicula.equals(nomPelicula.toString())) {
                resultado = pelicula;
                break;
            } else {
                resultado = pelicula;
            }
        }
        if (nomPelicula.equals(resultado)) {
            JOptionPane.showMessageDialog(null, "El resultado " + resultado, "Bscar Pelicula", 2);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro la pelicula " + nomPelicula, "Error", 3);
        }

    }

    @Override
    public void listar_peliculas() {
        JOptionPane.showMessageDialog(null, this.listaPeliculas, "ListaPeliculas", 1);
    }

    @Override
    public void insertar_peliculas(String nomPelicula) {
        this.listaPeliculas.add(nomPelicula.toString());
    }

}
