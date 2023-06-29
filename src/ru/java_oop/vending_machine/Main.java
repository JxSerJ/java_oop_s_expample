package ru.java_oop.vending_machine;

import ru.java_oop.vending_machine.products.Bottle;
import ru.java_oop.vending_machine.products.Product;
import ru.java_oop.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendMachine = new VendingMachine(1);

        Product product1 = new Bottle("coca-cola", 150.0, 1.5);
        Product product2 = new Product("milko", 100.0);

        vendMachine.addProduct(product1);
        vendMachine.addProduct(product2);

        System.out.println(vendMachine.getProductsInfo());

    }
}
