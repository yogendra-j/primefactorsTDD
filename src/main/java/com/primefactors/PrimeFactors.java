package com.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> factorsOf(int n) {
        List<Integer> factors = new ArrayList<>();
        int factor = 2;
        while (n > 1) {
            while (n % factor == 0) {
                factors.add(factor);
                n /= factor;
            }
            factor ++;
        }
        return factors;
    }
    
}
