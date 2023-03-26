package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    private static float[] testArray;

    // This method will be called before ALL the methods below
    @BeforeAll
    public static void setupGlobal() {
        System.out.println("Starting calculator tests...");
        testArray = new float[]{3, 45, 6.7f, 12, 4.2f, 8.9f};
    }


    // This method will be called before start run of EACH test
    @BeforeEach
    public void setupEach() {
        calculator = new Calculator();
    }

    // This method will be called after EACH test
    @AfterEach
    public void finalSetupEach() {
        System.out.println("This test is finished running!");
    }

    // This method will be called after running ALL the methods/tests
    @AfterAll
    public static void finalSetupGlobal() {
        System.out.println("Calculator test are finished successfully!");
    }

    @Test
    @Disabled // means test will not be run
    public void shouldReturnSumWhenAddArrayIsCalled() {

        float result = calculator.addArray(testArray);

        Assertions.assertEquals(78.0f, result);
    }

    @Test
    public void shouldReturnMultipliedWhenMultiplyArrayIsCalled() {

        float result = calculator.multiplyArray(testArray);

        Assertions.assertAll(() -> Assertions.assertTrue(result > 0),
                () -> Assertions.assertEquals(1217167.4f, result));
    }

}