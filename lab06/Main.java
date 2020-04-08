package com.lab06;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Task 1
        Multiplier m = new Multiplier();
        BigDecimal a = new BigDecimal(0.9999);
        BigDecimal b = new BigDecimal(54.654646);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(9);
        System.out.println(m.multiply(arrayList));

        Adder adder = new Adder();
        ArrayList<BigDecimal> arrayList1 = new ArrayList<BigDecimal>();
        arrayList1.add(a);
        arrayList1.add(b);
        BigDecimal c = new BigDecimal(5.654646);
        arrayList1.add(c);
        System.out.println(adder.add(arrayList1));

        //Task 2
        Address address = new Address();
        System.out.println(address.createAddress("Vietnam","Hanoi",
                "00-001", "Chinhkinh", 74));
    }
}
