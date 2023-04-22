package com.primefactors;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {

    @Test
    public void noPrimeFactors() {
        assertEquals(List.of(), PrimeFactors.factorsOf(1));
    }

    @Test
    public void singlePrimeFactor() {
        assertEquals(List.of(2), PrimeFactors.factorsOf(2));
        assertEquals(List.of(3), PrimeFactors.factorsOf(3));
        assertEquals(List.of(5), PrimeFactors.factorsOf(5));
        assertEquals(List.of(7), PrimeFactors.factorsOf(7));
    }

    @Test
    public void multiplePrimeFactors() {
        assertEquals(List.of(2, 3), PrimeFactors.factorsOf(6));
        assertEquals(List.of(2, 5), PrimeFactors.factorsOf(10));
        assertEquals(List.of(2, 3, 7), PrimeFactors.factorsOf(42));
        assertEquals(List.of(2, 5, 19, 31), PrimeFactors.factorsOf(2 * 5 * 19 * 31));
    }

    @Test
    public void multipleRepeatingPrimeFactors() {
        assertEquals(List.of(2, 2), PrimeFactors.factorsOf(2 * 2));
        assertEquals(List.of(2, 2, 3), PrimeFactors.factorsOf(2 * 2 * 3));
        assertEquals(List.of(2, 2, 3), PrimeFactors.factorsOf(2 * 2 * 3));
        assertEquals(List.of(2, 2, 2, 83, 83), PrimeFactors.factorsOf(2 * 2 * 2 * 83 * 83));
    }

}