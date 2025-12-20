// Topic: Array II
// Problem: Remove duplicate elements from a sorted array
// Approach: Two Pointer 
// Time Complexity: O(n)
// Space Complexity: O(1)

class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
      
        if (nums.length == 0)  return 0;

      // Pointer for unique elements
        int k = 1;
      t
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        // k represents number of unique elements
        return k;
    }
}
