package TCS2;

import java.util.ArrayList;

public class Tienda implements Interface_Product {
    protected int store_id;
    protected String name;
    protected String location;
    protected ArrayList<Producto> list_products;

    protected int product_id;
    protected String name2;
    protected String type;
    protected int quantity;
    protected int price;

    public Tienda() {
        list_products = new ArrayList<Producto>();
    }

    public void añadirProducto(Producto producto) {
        list_products.add(producto);
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Producto> getList_products() {
        return list_products;
    }

    public void setList_products(ArrayList<Producto> list_products) {
        this.list_products = list_products;
    }

    @Override
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

    @Override
    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Tienda [list_products=" + list_products + ", location=" + location + ", name=" + name + ", name2="
                + name2 + ", price=" + price + ", product_id=" + product_id + ", quantity=" + quantity + ", store_id="
                + store_id + ", type=" + type + "]";
    }

}
