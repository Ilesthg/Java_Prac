package Java_Proj.src.Inheritance.Lambda;

public class LambdaApp {

    public void calcular() {
        //------------------------------------------------------------------------------------------------------------------    
        /*
        //SE INSTANCIO EL OBJT DE LA CLASE INTERFACE Y SE CREO LA CALSE ANONIMA
        InterLambda operacion = new InterLambda() {
        
        @Override
        public double calcularPromedio(double n1, double n2) {
        
            return (n1 + n2) / 2;
        }
        
        };
        System.out.println(obj.calcularPromedio(5, 10));
        */
        //------------------------------------------------------------------------------------------------------------------
        // LLAMADA DE LA FUNCION LAMBDA DESDE UN METODO, FUERA DEL MAIN, -----NO VOID-----
        /*
        InterLambda operacion = (x, y) -> {
        return (x + y) / 2;
        };
        System.out.println(operacion.calcularPromedio(5, 10));
        */
        //------------------------------------------------------------------------------------------------------------------
        //LLAMADA DE LA FUNCION LAMBDA DESDE UN METODO, ------VOID------- 
        InterLambda ob2 = (n1, n2) -> {
            System.out.println("El resultado desde el metodo es :" + (n1 + n2) / 2);
        };
        ob2.calcularPromedio(5, 10);
        //------------------------------------------------------------------------------------------------------------------
    }

    public static void main(String[] args) {
        //LLAMAR EL METODO YA SEA, ---VOID---- O ----NO VOID------
        LambdaApp obj = new LambdaApp();
        obj.calcular();
        //------------------------------------------------------------------------------------------------------------------        
        /*
        //LLAMADA A LA FUNCION LAMBDA DESDE EL MAIN  ---- NO VOID----
        InterLambda ob1 = (a, b) -> {
            return (a + b) / 2;
        };
        System.out.println(ob1.calcularPromedio(5, 10));
        */
        //------------------------------------------------------------------------------------------------------------------
        InterLambda obj2 = (n1, n2) -> {
            double resultado = (n1 + n2) / 2;
            System.out.println("El resultado desde el main es : " + resultado);
        };
        obj2.calcularPromedio(5.0, 10);
    }

}
