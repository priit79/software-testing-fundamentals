package org.example.test;

import org.example.calculator.Multiply;
import org.example.calculator.Subtract;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractTest {

    @Test
    public void shouldReturnResultWhenSubtractArrayIsCalled() {

        int[] array = {500, 5, 35, 50};

        Subtract subtract = new Subtract();
        int result = subtract.subtractArray(array);

        Assertions.assertEquals(410, result);
    }
}