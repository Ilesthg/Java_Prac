package Inheritance.Test;

import Inheritance.Models.*;
import Inheritance.Models.FigurasModel.FigureGeoAbs;
import Inheritance.Models.FigurasModel.RectanguloAbs;

public class TestABS {

    public static void main(String[] args) {
        FigureGeoAbs figura = new RectanguloAbs("Rectangulo ");
        System.out.println(figura);
        figura.dibujar();
    }
}