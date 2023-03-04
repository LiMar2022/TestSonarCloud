package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int result = calculator.add(0, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(0, 0);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testMultiply() {
        long result = calculator.multiply(0, 0);
        Assertions.assertEquals(0L, result);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(2, 2);
        Assertions.assertEquals(1, result);
    }

    //@Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15; int b = 0;
        calculator.divide(a, b);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme