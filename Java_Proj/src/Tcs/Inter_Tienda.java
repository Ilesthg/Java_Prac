package Tcs;

import java.util.ArrayList;

public interface Inter_Tienda {

    public String getName();

    public void setName(String name);

    public int getStore_id();

    public void setStore_id(int store_id);

    public String getLocation();

    public void setLocation(String location);

    public ArrayList<Product> getList_products();

    public void setList_products(ArrayList<Product> list_products);

}
