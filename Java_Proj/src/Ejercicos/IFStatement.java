package Java_Proj.src.Ejercicos;

import java.util.Scanner;

public class IFStatement {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String question = "Cuando fue la independencia de mexico";
        String ans1 = "16 de septiembre";
        String ans2 = "5 de noviembre";
        String ans3 = "4 de marzo";
        String correct = ans1;
        correct.toLowerCase();

        System.out.println(question);
        System.out.println("Eliga una respuesta " + ans1 + " , " + ans2 + "  or  " + ans3);

        System.out.println("Escriba su respuesta");
        String inputUser = leer.nextLine();

        if (inputUser.equals(correct)) {
            System.out.println("correct");
        } else {
            System.out.println("Incorrecto");
        }

    }

}