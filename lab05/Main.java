package com.lab05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("Alpha", "Nguyen", "sXXXX1@gmail.com","alphanguyen");
        User u2 = new User("sXXXX2@gmail.com");
        u2.createUserFromGuest("Beta", "Nguyen", "betanguyen");

        Product p1 = new Product("Rice",20,111);
        Product p2 = new Product("Pasta", 1.50, 222,9);
        Product p3 = new Product("Bread",2.39,333,9);
        p2.setPrice(99.99);
        p3.setNumOfItems(5);

        Category c1 = new Category();
        Category c2 = new Category("Asian");
        ArrayList<Product> ps1 = new ArrayList<Product>();
        ps1.add(p1);
        ps1.add(p2);
        Category c3 = new Category("Food",ps1);
        c1.addProduct(p1);
        c2.addProduct(p1);
        c3.addProduct(p3);

        Busket b1 = new Busket();
        Busket b2 = new Busket(u1);
        Product[] pss1 = new Product[]{p2};
        Busket b3 = new Busket(u2, pss1);
        b3.addProduct(p2);
        b3.addProduct(p2);
        b3.deleteProduct(p2);
        System.out.println(b3.buy());
    }
}
