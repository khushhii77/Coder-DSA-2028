// Topic: Array II
// Problem: Find repeating element in array
// Approach: Brute force (nested loops)
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class FindRepeatingBrute {
    public static int findRepeating(int[] arr) {
         int n = arr.length;

        System.out.print("Repeating elements: ");

        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;

            // Check if arr[i] appears again
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

            // Print only once
            if (isRepeated) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
