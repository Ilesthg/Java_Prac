package Inheritance.Test;

import Inheritance.Models.BaseDatos;
import Inheritance.Models.My_sql_inter;

public class Test_Interface {
    public static void main(String[] args) {
        BaseDatos obj = new My_sql_inter();
        obj.actualizar();
    }
}
