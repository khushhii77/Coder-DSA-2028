// Topic: Array I
// Problem: Left rotate array by k positions
// Approach: Repeated shifting
// Time Complexity: O(n*k)
// Space Complexity: O(1)

class RotateArray {
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            int a = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = a;
        }
    }
}
