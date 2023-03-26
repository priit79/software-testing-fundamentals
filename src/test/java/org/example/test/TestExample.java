package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {                                  // class name should say what test is about, e.g. ShoppingTest
    @Test
    public void shouldReturnCorrectAddedNumbers() {         // all test are public // name should say what test is about

        // given
        final int a = 8;
        final int b = 55;

        // when
        final int addResult = a + b;

        //then
        Assertions.assertEquals(63, addResult);     // first is expected value, second is real value what will come out
    }
}