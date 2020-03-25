package com.lab04;

public class Main {

    public static void main(String[] args) {
        //Task 1
        User u1 = new User("Alpha", "Nguyen", "sXXXX1@gmail.com","alphanguyen");
        User u2 = new User("sXXXX2@gmail.com");
        u2.createUserFromGuest("Beta", "Nguyen", "betanguyen");

        //Task 2
        Product p1 = new Product("Rice",20,"XXX1");
        Product p2 = new Product("Pasta", 1.50, "XXX2",9);
        Product p3 = new Product("Bread",2.39,"XXX3",9);
        p2.setPrice(99.99);
        p3.setAmount(5);
    }
}
