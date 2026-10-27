package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void addition_isCorrect() {
        assertEquals(5, calc.add(2, 2)); // 2+2=4, on attend 5 → ÉCHEC
    }

    @Test
    public void subtract_isCorrect() {
        assertEquals(4, calc.subtract(8, 3)); // 8-3=5, on attend 4 → ÉCHEC
    }
}
