// Topic: Array II
// Problem: Find equilibrium element in an array
// Approach: Brute force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class FindEquilibriumBrute {
    public static int findEquilibrium(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int l_Sum = 0;
            int r_Sum = 0;

            for (int j = 0; j < i; j++) {
                l_Sum += arr[j];                //sum of left elements from index i
            }
            for (int j = i + 1; j < arr.length; j++) {
                r_Sum += arr[j];                //sum of right elements from index i
            }
          
            if (l_Sum == r_Sum) {
                return i;
            }
        }

        return -1;
    }
}
