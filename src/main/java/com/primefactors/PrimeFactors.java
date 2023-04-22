package com.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> factorsOf(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int factor = 2; factor <= n; factor ++) {
            while (n % factor == 0) {
                factors.add(factor);
                n /= factor;
            }
        }
        return factors;
    }
    
}
