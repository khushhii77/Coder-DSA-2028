// Topic: Array I
// Problem: Reverse array after given index M
// Approach: Two Pointer (Optimal)
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
class ReverseArrayAfterM {

    public static void reverseAfterM(ArrayList<Integer> arr, int m) {
        int left = m + 1, right = arr.size() - 1;

        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
            right--;
        }
    }
}
