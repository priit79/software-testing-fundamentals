package org.example.test;

import org.example.calculator.Divide;
import org.example.calculator.Multiply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    @Test
    public void shouldReturnResultWhenMultiplierArrayIsCalled() {

        int[] array = {3, 5, 10, 35};

        Multiply multiply = new Multiply();
        int result = multiply.multiplyArray(array);

        Assertions.assertEquals(5250, result);
    }
}