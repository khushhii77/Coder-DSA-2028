// Topic: Array I
// Problem: Running sum of 1D array
// Approach: Prefix sum
// Time Complexity: O(n)
// Space Complexity: O(1)

class RunningSum {
    static void runningSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }
}
