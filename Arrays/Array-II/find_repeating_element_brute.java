// Topic: Array II
// Problem: Find repeating element in array
// Approach: Brute force (nested loops)
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class FindRepeatingBrute {
    public static int findRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
