package Tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> list_products = new ArrayList();
        //ArrayList<Store_Sania> tiendas = new ArrayList<>();

        Store_Sania st1 = new Product();
        st1.setStore_id(1);
        st1.setName("Prada");
        st1.setLocation("Second Floor");

        Store_Sania st2 = new Product();
        st2.setStore_id(2);
        st2.setName("Pandora");
        st2.setLocation("First Floor");

        Product p1 = new Product();
        // p1.setStore_id(1);
        //p1.setName("Fabrica 1");
        // p1.setLocation("Third Floor");
        p1.setProduct_id(1);
        p1.setName2("Aretes");
        p1.setType("p1");
        p1.setQuantity(1);
        p1.setPrice(111);

        Product p2 = new Product();
        //p2.setStore_id(2);
        // p2.setName("La fabrica de Willy");
        //p2.setLocation("Second Floor");
        p2.setProduct_id(2);
        p2.setName2("Perlas");
        p2.setType("p2");
        p2.setQuantity(2);
        p2.setPrice(228);

        Product p3 = new Product();
        //  p3.setStore_id(3);
        // p3.setName("La fabrica de asdasd");
        //p3.setLocation("First Floor");
        p3.setProduct_id(3);
        p3.setName2("Collares");
        p3.setType("pr3");
        p3.setQuantity(3);
        p3.setPrice(3);

        Product p4 = new Product();
        //  p3.setStore_id(3);
        // p3.setName("La fabrica de asdasd");
        //p3.setLocation("First Floor");
        p4.setProduct_id(4);
        p4.setName2("Cadenas 2");
        p4.setType("pr4");
        p4.setQuantity(4);
        p4.setPrice(4444);

        Product p5 = new Product();
        //  p3.setStore_id(3);
        // p3.setName("La fabrica de asdasd");
        //p3.setLocation("First Floor");
        p5.setProduct_id(5);
        p5.setName2("Borradores");
        p5.setType("pr5");
        p5.setQuantity(5);
        p5.setPrice(5);

        //metodo para añadir productos a la tienda
        st1.añadirProducto(p1);
        st1.añadirProducto(p2);
        st1.añadirProducto(p3);

        st2.añadirProducto(p3);
        st2.añadirProducto(p4);
        st2.añadirProducto(p5);

        //ARRAY DE LISTA DE PRODUCTOS
        list_products.add(p1);
        list_products.add(p2);
        list_products.add(p3);
        list_products.add(p4);
        list_products.add(p5);

        //ARRAY DE TIENDAS
        List<Store_Sania> tiendas = Arrays.asList(st1, st2);

        //CICLO FOR PARA VER LA SUMA DE PRODUCTOS POR TIENDA
        /*  for (int i = 0; i < tiendas.size(); i++) {
            System.out.println(tiendas.get(i).list_products);
            System.out
                    .println(
                            "La suma de la Tienda: " + tiendas.get(i).getName() + " es : "
                                    + tiendas.get(i).sumaProdi());
        }*/
        //buscarPorProducto(list_products, tiendas);
        //buscarPorTienda(tiendas);
        sumarProductosTiendas(tiendas);
        //sumaTotal(list_products);
        //mayorProductos(list_products);

        //CREAR TIENDA CON NOMBRE, LOCACION Y ID
        //Agregar_P(list_products);
        /*
          
             for (int i = 0; i < list_products.size(); i++) {
            System.out.println("---------------------" + list_products.get(i).getName2());
            String s = list_products.get(i).Mostrar();
            System.out.println("bro" + s);
        }
         */

        /*
        
           for (int i = 0; i < list_products.size(); i++) {
            
            String busqueda = list_products.get(i).getName2();
        
            if (busqueda.equalsIgnoreCase(nombre)) {
                existe = true;
                System.out.println(
                        "El producto coincide :  producto buscado:  "
                                + list_products.get(i).getName2()
                                + "\nEl iD de la Tienda es: " + tiendas.get(i).getStore_id()
                                + "\nEl Nombre de la Tienda es: " + tiendas.get(i).getName()
                                + "\nLa localizacion de la Tienda es: " + tiendas.get(i).getLocation());
                break;
        
            }
        }
        if (existe) {
        
        } else {
            System.out.println("No existe el producto ingresado");
        }
         
        */

    }

    private static void Buscar_Producto(ArrayList<Product> list_products, List<Store_Sania> tiendas) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------------------------");
        boolean existe = false;
        System.out.println("Que producto buscara:  ");
        String nombresillo = leer.nextLine();
        for (Product a : list_products)

        {

            String busqueda = a.getName2();
            if (busqueda.equalsIgnoreCase(nombresillo)) {
                existe = true;

                /* System.out.println(
                         "El producto coincide :  producto buscado:  "
                                 + list_products.get(i).getName2()
                                 + "\nEl iD de la Tienda es: " + list_products.get(i).getStore_id()
                                 + "\nEl Nombre de la Tienda es: " + list_products.get(i).getName()
                                 + "\nLa localizacion de la Tienda es: " + list_products.get(i).getLocation());
                  */

                break;
            }
        }
        if (existe) {

        } else {
            System.out.println("No existe el producto ingresado");
        }
        System.out.println("---------------------------------------");
    }

    private static void buscarPorTienda(List<Store_Sania> tiendas) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------------------------");
        boolean existe = false;
        System.out.println("Que tienda buscara:  ");
        String nombresillo = leer.nextLine();

        for (Store_Sania e : tiendas) {
            String busqueda = e.getName();
            if (busqueda.equalsIgnoreCase(nombresillo)) {
                existe = true;
                System.out.println("La suma de la tienda: " + e.getName() + " es: " + e.sumaProdi());
                System.out.println("Los productos que tiene son: ");
                e.productosNombres();
            }
        }
        if (existe) {

        } else {
            System.out.println("No existe la tienda ingresada");
        }
    }

    private static void buscarPorProducto(ArrayList<Product> list_products, List<Store_Sania> tiendas) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------------------------");
        boolean existe = false;
        System.out.println("Que producto buscara:  ");
        String nombresillo = leer.nextLine();

        for (int i = 0; i < list_products.size(); i++) {
            String busqueda = list_products.get(i).getName2();
            if (busqueda.equalsIgnoreCase(nombresillo)) {
                existe = true;
                for (Store_Sania r : tiendas) {
                    r.buscarProducto(nombresillo);
                }

            }
        }
        if (existe) {

        } else {
            System.out.println("No existe el producto ingresado");
        }
        leer.close();
    }

    private static void sumarProductosTiendas(List<Store_Sania> tiendas) {
        //SUMA PRODUCTOS POR TIENDA
        for (Store_Sania e : tiendas) {
            System.out.println("La suma de la tienda: " + e.getName() + " es: " + e.sumaProdi());
            System.out.println("Los productos que tiene son: ");
            e.productosNombres();
        }
    }

    private static void sumaTotal(ArrayList<Product> list_products) {
        //SUMA TOTAL DE LOS PRODUCTOS
        int suma = 0;
        for (Product a : list_products) {
            suma += a.getPrice();
        }
        System.out.println("La suma TOTAL es de: " + suma);
    }

    private static void Agregar_P(ArrayList<Product> list_products) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        leer.useDelimiter("\n");

        System.out.println("INTRODUZCA EL ID DE LA NUEVA TIENDA :");
        int store_id = leer2.nextInt();

        System.out.println("Nombre:");
        String nombre_de_la_tienda = leer.nextLine();

        System.out.println("Locacion:");
        System.out.println("SOLO INTRODUZCA VALORES LIKE: 1.-FIRST FLOOR, 2.- SECOND FLOOR, 3.- THIRD FLOOR ");
        String location = leer.nextLine();

        String n1 = "First Floor";
        String n2 = "Second Floor";
        String n3 = "Third floor";

        boolean l_existe = false;

        while (l_existe == false) {

            if (location.equalsIgnoreCase(n1)) {
                System.out.println("-");
                l_existe = true;
                break;
            } else if (location.equalsIgnoreCase(n2)) {
                System.out.println("-");
                l_existe = true;
                break;
            }
            if (location.equalsIgnoreCase(n3)) {
                System.out.println("-");
                l_existe = true;
                break;
            } else {
                System.out.println("Locacion No admitida");
                l_existe = false;
                break;
            }

        }
        if (l_existe == true) {
            Product p_aux = new Product();
            p_aux.setStore_id(store_id);
            p_aux.setName(nombre_de_la_tienda);
            p_aux.setLocation(location);
            list_products.add(p_aux);
            System.out.println("Producto creado!");
        }

    }

    private static void mayorProductos(ArrayList<Product> list_products) {
        //SACAR EL PRODUCTO MAYOR PRECIO
        System.out.println("-----------------ELMAYORES----------------------");

        Product producto_mayor = new Product();
        list_products.add(producto_mayor);
        //p1 = list_products.get(0);
        for (Product product : list_products) {
            if (product.getPrice() > producto_mayor.getPrice()) {
                producto_mayor = product;
            }
        }
        System.out
                .println(
                        "El mayor es : " + producto_mayor.getName2() + " y su precio es: " + producto_mayor.getPrice());
    }

}
