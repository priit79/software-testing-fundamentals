package org.example.calculator;

public class Calculator {
    public float addArray(float[] inputArray) {
        float result = 0;

        for (float input : inputArray) {
            result += input;
        }
        return result;
    }

    public float addNumbers(int a, int b) {
        return a + b;
    }


    public float multiplyArray(float[] inputArray) {
        float result = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            result *= inputArray[i];
        }
        return result;
    }
}