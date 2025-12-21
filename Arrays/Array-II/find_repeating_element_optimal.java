// Topic: Array II
// Problem: Find all repeating elements in an array
// Approach: HashMap frequency counting (optimal)
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;
class FindRepeatingOptimal {
    public static void findRepeating(int[] arr) {
      HashMap<Integer, Integer> map = new HashMap<>();

        // we Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // we print elements with frequency more than 1(repeated element)
        System.out.print("Repeating elements: ");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}
