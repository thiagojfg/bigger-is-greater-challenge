package com.teckstack.algorithms.bigger_is_greater;

import java.util.Objects;

public class BiggerIsGreater {

    public String resolve(String input) {
        char[] inputArray = input.toCharArray();
        String smallestGreaterCombination = null;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                System.out.println("Comparing " + inputArray[i] + " and " + inputArray[j] + "");
                if (inputArray[i] == inputArray[j]) {
                    continue;
                }

                char temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;

                String newCombination = new String(inputArray);
                if (newCombination.compareTo(input) > 0) {
                    if (smallestGreaterCombination == null || smallestGreaterCombination.compareTo(newCombination) > 0) {
                        smallestGreaterCombination = newCombination;
                    }
                }
            }
        }
        return Objects.requireNonNullElse(smallestGreaterCombination, "no answer");
    }
}
