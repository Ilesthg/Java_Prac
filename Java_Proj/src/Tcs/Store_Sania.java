package Java_Proj.src.Tcs;

import java.util.ArrayList;

public class Store_Sania extends Mall_Sania implements Inter_Tienda {

    protected int store_id;
    protected String name;
    protected String location;
    protected ArrayList<Product> list_products;

    public Store_Sania(ArrayList<Product> list_products) {
        this.list_products = list_products;
    }

    public Store_Sania(int store_id, String name, String location) {
        this.store_id = store_id;
        this.name = name;
        this.location = location;
    }

    public Store_Sania(int store_id, String name, String location, ArrayList<Product> list_products) {
        this.store_id = store_id;
        this.name = name;
        this.location = location;
        this.list_products = list_products;
    }

    public Store_Sania() {
        list_products = new ArrayList<Product>();
    }

    public void añadirProducto(Product producto) {
        list_products.add(producto);
    }

    public int sumaProdi() {
        return list_products.stream().mapToInt(l -> l.getPrice()).sum();
    }

    /*
    //MANERA DE SACAR PRODUCTOS CON LAMBDA 
     public void productosN() {
        list_products.stream()
                .map(pro -> pro.getName2())
                .forEach(System.out::println);
    }*/

    public void productosNombres() {
        list_products.forEach(p -> {
            System.out.println("Producto : " + p.getName2() + " y su precio es: " + p.getPrice());
        });
    }

    public String nombre2() {
        String busqueda = null;
        for (Product a : list_products) {
            busqueda = a.getName2();
        }
        return busqueda;
    }

    public void buscarProducto(String producto) {

        list_products.forEach(per -> {
            if (per.getName2().equalsIgnoreCase(producto)) {
                System.out.println("Se encontro el producto en la tienda: " + getName());
                System.out.println("El id de la tienda es : " + getStore_id());
                System.out.println("La localizacion de la tienda es : " + getLocation());
                System.out.println("El precio del Producto es : " + per.getPrice());
            }
        });
    }

    public void buscarProdPrecio(String producto) {

        list_products.forEach(per -> {
            if (per.getName2().equalsIgnoreCase(producto)) {

                System.out.println("Se encontro el producto en la tienda: " + getName());
                System.out.println("El precio del Producto es : " + per.getPrice());

            }

        });

    }

    public String Mostrar() {
        return "Desde Mostrar Store [Tostring tienda=" + list_products + ", location=" + location + ", name=" + name
                + ", store_id=" + store_id + "]";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getStore_id() {
        return store_id;
    }

    @Override
    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;

    }

    @Override
    public ArrayList<Product> getList_products() {
        return list_products;
    }

    @Override
    public void setList_products(ArrayList<Product> list_products) {
        this.list_products = list_products;
    }

    public String SinArray() {
        return "Store_Sania [location=" + location + ", name=" + name + ", store_id=" + store_id + "]";
    }

    public String PuroArray() {
        return "Store list_products=" + list_products;
    }

    public String Store() {
        return "Store_Sania [list_products=" + list_products + ", location=" + location + ", name=" + name
                + ", store_id=" + store_id + "]";
    }

    @Override
    public String toString() {
        return "Store_Sania [list_products=" + list_products + ", location=" + location + ", name=" + name
                + ", store_id=" + store_id + "]";
    }

}
