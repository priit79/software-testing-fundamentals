package org.example.calculator;

public class Multiply {

    public int multiplyArray(int[] inputArray) {

        int result = inputArray[0];
        for (int j = 1; j < inputArray.length; j++) {
            result *= inputArray[j];
        }
        return result;
    }
}