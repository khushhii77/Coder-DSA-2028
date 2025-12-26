// Topic: Stack Implementation
// Problem: Next Greater Element I
// Description: For each element in nums1 find next greater in nums2
// Approach: Monotonic stack + hashmap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int x : nums2){
            while(!st.isEmpty() && st.peek() < x){
                mp.put(st.pop(), x);
            }
            st.push(x);
        }
        int ans[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            ans[i] = mp.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}
