// Topic: Array I
// Problem: Removing Minimum and Maximum From Array
// Source: LeetCode 2091
// Time Complexity: O(n)
// Space Complexity: O(1)

// Logic Explanation:
// We first locate the positions of minimum and maximum elements.
// Since deletion is allowed only from the front or back, we try
// three possible ways:
// 1) Delete both elements from the front
// 2) Delete both elements from the back
// 3) Delete one from the front and one from the back
// The minimum deletions among these three cases is the answer.


class RemoveMinMax {

    public static int minimumDeletions(int[] nums) {

        int n = nums.length;

        // we Find index of min and max
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIdx])
                minIdx = i;
            if (nums[i] > nums[maxIdx])
                maxIdx = i;
        }

        // we will Calculate deletions
        int deleteFromFront = Math.max(minIdx, maxIdx) + 1;
        int deleteFromBack = n - Math.min(minIdx, maxIdx);
        int deleteMixed = (Math.min(minIdx, maxIdx) + 1)  + (n - Math.max(minIdx, maxIdx));

        return Math.min(deleteFromFront, 
               Math.min(deleteFromBack, deleteMixed));
    }
}
