//Topic: ArrayI
// Problem: Rotate array by k positions
// Approach: Reversal technique (optimal)
// Time Complexity: O(n)
// Space Complexity: O(1)

class RotateArray {
    public static void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;

        reverse(nums, 0, n - 1);       // Step 1: Reverse entire array
        reverse(nums, 0, k - 1);       // Step 2: Reverse first k elements
        reverse(nums, k, n - 1);       // Step 3: Reverse remaining

    return 0;
}

public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
    }
}
