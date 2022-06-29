package Tcs;

import java.util.ArrayList;
import java.util.List;

public class Product extends Store_Sania implements Inter_Product {

    protected int product_id;
    protected String name2;
    protected String type;
    protected int quantity;
    protected int price;

    public Product(int store_id, String name, String location, ArrayList<Product> list_products, int product_id,
            String name2, String type, int quantity, int price) {
        super(store_id, name, location, list_products);
        this.product_id = product_id;
        this.name2 = name2;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(int store_id, String name, String location, int product_id, String name2, String type, int quantity,
            int price) {
        super(store_id, name, location);
        this.product_id = product_id;
        this.name2 = name2;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    //--
    public Product() {

    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String Mostrar() {
        return super.Mostrar();
    }

    public String SoloPrecio() {

        return "Product Precio " + price;
    }

    @Override
    public String toString() {
        return "\nProduct Nombre : " + name2 +
                "\nPrecio : " + price +
                "\nProducto iD: " + product_id +
                "\nCantidad : " + quantity
                + "\nTipo : " + type;
    }

}
