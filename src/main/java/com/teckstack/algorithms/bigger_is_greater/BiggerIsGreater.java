package com.teckstack.algorithms.bigger_is_greater;

import java.util.Objects;

public class BiggerIsGreater {

    public String resolve_in_o_n2(String input) {
        char[] inputArray = input.toCharArray();
        String smallestGreaterCombination = null;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
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


    public String resolve_in_o_n(String input) {
        char[] chars = input.toCharArray();
        int n = chars.length;

        // Step 1: Find the pivot
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            // If the current character is greater than the next character, we found the pivot
            if (chars[i] < chars[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If no pivot found, the input is the highest permutation
        if (pivot < 0) {
            return "no answer";
        }

        // Step 2: Find the smallest character greater than pivot from the right
        int successor = -1;
        for (int i = n - 1; i > pivot; i--) {
            if (chars[i] > chars[pivot]) {
                successor = i;
                break;
            }
        }

        // Step 3: Swap pivot with successor
        swap(chars, pivot, successor);

        // Step 4: Reverse the suffix starting right after pivot
        reverse(chars, pivot + 1, n - 1);

        return new String(chars);
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
