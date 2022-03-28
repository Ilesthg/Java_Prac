package Inheritance.Test;

import Inheritance.Models.*;

public class TestABS {

    public static void main(String[] args) {
        FigureGeoAbs figura = new RectanguloAbs("Rectangulo ");
        System.out.println(figura);
        figura.dibujar();
    }
}