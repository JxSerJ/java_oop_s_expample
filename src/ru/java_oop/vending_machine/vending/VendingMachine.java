package ru.java_oop.vending_machine.vending;

import ru.java_oop.vending_machine.products.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int id;
    private int productId;
    private List<Product> productList;  // initialize every object-type filed in class before use it!

    public VendingMachine(int id) {
        this.id = id;
        productList = new ArrayList<>();
    }

    public String getProductsInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Product list:\n");
        for (Product product : productList){
            sb.append(product);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addProduct(Product product){
        product.setId(productId++);
        productList.add(product);
    }
}
