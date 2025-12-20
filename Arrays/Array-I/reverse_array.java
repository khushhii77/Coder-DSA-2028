// Topic: Array I
// Problem: Reverse the array
// Approach: Swap elements from start and end using 2-pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

class ReverseArray {
    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
