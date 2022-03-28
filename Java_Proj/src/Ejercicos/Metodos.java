package Ejercicos;

public class Metodos {

    public void myMetod(String saludo) {
        System.out.println("HOLA CRAYOLA" + "" + saludo);

    }

    public static void main(String[] args) {
        // OBJETO CREADO PARA UTILIZAR EL METODO SE USA EL NOMBRE DE LA CLASE
        Metodos s = new Metodos();
        s.myMetod("Pedro");
    }
}
