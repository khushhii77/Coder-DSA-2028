// Topic: Array III
// Problem: Maximum product subarray
// Approach: Optimized traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class MaxProduct {
    static int MaxSubarrayProductKadane(int[] arr) {
        int max = arr[0], min = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            ans = Math.max(ans, max);
        }
        return ans;
    }
}
