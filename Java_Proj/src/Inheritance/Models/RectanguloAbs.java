package Inheritance.Models;

public class RectanguloAbs extends FigureGeoAbs {

    public RectanguloAbs(String tipoFigura) {
        super(tipoFigura);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void dibujar() {
        System.out.println("Soy el metodo abstracto dibujar en la clase rectangulo" + getClass().getSimpleName());

    }

}
