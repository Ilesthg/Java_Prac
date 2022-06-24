package Tcs;

import java.util.ArrayList;

public class Store_Sania extends Mall_Sania implements Inter_Tienda {

    protected int store_id;
    protected String name;
    protected String location;
    protected ArrayList<Store_Sania> tien;
    protected ArrayList<Product> list_products;

    public Store_Sania(int store_id, String name, String location, ArrayList<Store_Sania> tien,
            ArrayList<Product> list_products) {
        this.store_id = store_id;
        this.name = name;
        this.location = location;
        this.tien = tien;
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

    protected static void inserte_Locacion(String loc) {
        String n1 = "Firt Floor";
        String n2 = "Second Floor";
        String n3 = "Third floor";

        if (loc.equalsIgnoreCase(n1))
            System.out.println("");
        else if (loc.equalsIgnoreCase(n2))
            System.out.println("");
        else if (loc.equalsIgnoreCase(n3))
            System.out.println("");
        else
            System.out.println("Locacion No admitida");

    }

    public String MostrarTienda() {
        return "Mostrar Tienda =" + list_products + ", location=" + location + ", name=" + name
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

    @Override
    public String toString() {
        return "Store_Sania [list_products=" + list_products + ", location=" + location + ", name=" + name
                + ", store_id=" + store_id + "]";
    }

}
