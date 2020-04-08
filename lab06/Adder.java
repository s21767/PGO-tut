package com.lab06;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {
    public int add(int a, int b){
        return a+b;
    }

    public BigDecimal add(ArrayList<BigDecimal> nums){
        BigDecimal result = null;
        for(BigDecimal n : nums) {
            if (result == null) {
                result = n;
            } else {
                result = result.add(n);
            }
        }
        return result;
    }
}
