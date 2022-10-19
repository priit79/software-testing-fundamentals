package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {
    @Test
    public void shouldReturnCorrectAddedNumbers() {
        final int a = 8;
        final int b = 55;

        // when
        final int addresult = a + b;

        //then
        Assertions.assertEquals(63, addresult);
    }
}
