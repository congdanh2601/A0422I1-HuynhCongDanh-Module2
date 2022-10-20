package ss12_map_tree.e_product_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public int addProduct(int id, String name, int price) {
        Product p = new Product(id, name, price);
        productList.add(p);
        return productList.size();
    }

    public void editProduct(int id, String name) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(name);
            }
        }
    }

    public void removeById(int id) {
        productList.removeIf(p -> p.getId() == id);
    }



}
