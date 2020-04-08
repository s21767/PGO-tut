package com.lab06;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {
    public int multiply(int a, int b){
        return a*b;
    }

    public int multiply(int a, int b, int c, int d){
        return multiply(a,b)*multiply(c,d);
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }

    public int multiply(ArrayList<Integer> nums){
        int result = 1;
        for(int n : nums){
            result *= n;
        }
        return result;
    }
}
