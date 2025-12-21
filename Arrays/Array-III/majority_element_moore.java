// Topic: Array III
// Problem: Find majority element(The majority element is the element that appears more than ⌊n / 2⌋ times)
// Approach: Moore's Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

class MajorityElementMoore {
    static int majority(int[] arr) {
        int count = 0, ans = 0;

        for (int x : arr) {
            if (count == 0)
                ans = x;

            if (x == candidate) count++;
            else
              count--;
        }

        // now we will verify bcoz First loop may still pick some ans, but it’s not guaranteed majority.
        count = 0;
        for (int x : arr)
            if (x == ans) count++;

        if (count > n/2)
          return ans;
       else
         return -1;
    }
}
