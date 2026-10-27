package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void addition_isCorrect() {
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void subtract_isCorrect() {
        assertEquals(4, calc.subtract(8, 4));
    }
}
