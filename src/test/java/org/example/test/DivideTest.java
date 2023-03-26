package org.example.test;

import org.example.calculator.Calculator;
import org.example.calculator.Divide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    public void shouldReturnQuotientWhenDivideArrayIsCalled() {

        int[] array = {1000, 2};

        Divide divide = new Divide();
        int result = divide.divideArray(array);

        Assertions.assertEquals(500, result);

    }
}