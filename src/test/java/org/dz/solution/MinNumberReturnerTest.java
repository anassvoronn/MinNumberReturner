package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;


public class MinNumberReturnerTest {

    @Test
    public void getMinimalNumber10_0_minus2() {
        MinNumberReturner returner = new MinNumberReturner();
        double result = returner.getMinimalNumber(10, 0, -2);
        Assert.assertEquals(0, result, 0);

    }

    @Test
    public void getMinimalNumber18_3_25() {
        MinNumberReturner returner = new MinNumberReturner();
        double result = returner.getMinimalNumber(18, 3, 25);
        Assert.assertEquals(3, result, 0);

    }

    @Test
    public void getMinimalNumber6_6_6() {
        MinNumberReturner returner = new MinNumberReturner();
        double result = returner.getMinimalNumber(6, 6, 6);
        Assert.assertEquals(6, result, 0);

    }

    @Test
    public void getMinimalNumberMinus6_Minus6_Minus6() {
        MinNumberReturner returner = new MinNumberReturner();
        double result = returner.getMinimalNumber(-6, -6, -6);
        Assert.assertEquals(-6, result, 0);

    }

    @Test
    public void getMinimalNumberMinus5_Minus6_Minus6() {
        MinNumberReturner returner = new MinNumberReturner();
        double result = returner.getMinimalNumber(-5, -6, -6);
        Assert.assertEquals(-5, result, 0);

    }

}