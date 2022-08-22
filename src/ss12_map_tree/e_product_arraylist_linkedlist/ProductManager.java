package ss12_map_tree.e_product_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public int addProduct(Product product) {
        productList.add(product);
        return productList.size();
    }

    public void editProduct(int id, String name) {



    }

    public void remove(int id) {

    }



}
