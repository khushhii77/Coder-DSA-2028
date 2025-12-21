// Topic: Array III
// Problem: Intersection of two arrays
// Approach: HashSet (Optimal)
// Time Complexity: O(n + m)
// Space Complexity: O(n)

import java.util.HashSet;
import java.util.Set;

class IntersectionOptimal {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        // we check common elements(means intersection)
        for (int x : nums2) {
            if (set1.contains(x)) {
                result.add(x);
            }
        }

        int[] ans = new int[result.size()];  // we convert result set to array
        int i = 0;
        for (int x : result) {
            ans[i++] = x;         
        }

        return ans;
    }
}
