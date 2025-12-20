// Topic: Array II
// Problem: Find element in an array
// Approach: Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)

class FindElement {
    public static int findElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;   // element found
            }
        }
        return -1;  // element not found
    }
}
