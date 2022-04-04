package Inheritance.Test;

import Inheritance.Models.Animal.*;

public class TestHerenciaAnimal {

    public static void main(String[] args) {
        Cat cat = new Cat("LILY", 8, 'm', "PURINA");
        cat.eat();
        System.out.println(cat);

    }
}
