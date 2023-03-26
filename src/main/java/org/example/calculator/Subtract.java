package org.example.calculator;

public class Subtract {
    public int subtractArray(int[] inputArray) {

        int result = inputArray[0];
        for (int j = 1; j < inputArray.length; j++) {
            result -= inputArray[j];
        }
        return result;
    }
}