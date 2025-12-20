// Topic: Array I
// Problem: Find maximum and minimum element
// Approach: Single traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class MaxMinArray {
   static void findMaxMin(int[] arr) {
    int max = arr[0];
    int min = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) max = arr[i];
        if (arr[i] < min) min = arr[i];
    }
   }
}
