# Bigger is Greater

A Java implementation of the "Bigger is Greater" algorithm, which finds the next lexicographically greater permutation of a given string.

## Objective

The goal of this project is to implement an algorithm that, given a word, finds the lexicographically smallest word that is lexicographically greater than the given word. If no such word exists, it returns "no answer".

For example:
- Input: "ab" → Output: "ba"
- Input: "hefg" → Output: "hegf"
- Input: "bb" → Output: "no answer" (no lexicographically greater permutation exists)

## Implemented Approaches

### 1. O(n²) Solution

The first implementation (`resolve_in_o_n2`) uses a brute force approach:
- It tries all possible swaps of characters
- For each swap, it checks if the resulting string is lexicographically greater than the input
- Among all greater permutations, it selects the lexicographically smallest one

### 2. O(n) Solution

The second implementation (`resolve_in_o_n`) uses a more efficient algorithm:
1. Find the pivot (the rightmost character that is smaller than its successor)
2. Find the smallest character to the right of the pivot that is greater than the pivot
3. Swap the pivot with this character
4. Reverse the suffix starting right after the pivot position

This approach is based on the standard algorithm for finding the next permutation and has linear time complexity.

## Potential Improvements

1. **Error Handling**: Add input validation and better error handling
2. **Memory Efficiency**: Implement in-place operations to reduce memory usage
3. **API Enhancement**: Create a more flexible API that could work with different types of sequences
4. **Documentation**: Add Javadoc comments to explain the algorithm in more detail
5. **Benchmarking**: Add performance benchmarks to compare the two implementations