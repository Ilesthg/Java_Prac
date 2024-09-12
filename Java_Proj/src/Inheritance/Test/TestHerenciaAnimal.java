package Java_Proj.src.Inheritance.Test;

import Java_Proj.src.Inherit.Models.Animal.Cat;
import Java_Proj.src.Inherit.Models.Animal.Animal;

public class TestHerenciaAnimal {

    public static void main(String[] args) {
        Cat cat = new Cat("LILY", 8, 'm', "PURINA");
        cat.eat();
        System.out.println(cat);

    }
}
