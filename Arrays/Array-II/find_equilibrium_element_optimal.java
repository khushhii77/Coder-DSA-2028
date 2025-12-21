// Topic: Array II
// Problem: Find equilibrium element in an array
// Approach: Prefix sum (optimal)
// Time Complexity: O(n)
// Space Complexity: O(1)

// [An equilibrium index is an index in the array where the sum of all elements to the left of that index is equal to the sum of all elements to the right.]


class FindEquilibriumElement {
    public static int findEquilibrium(int[] arr) {

        int totalSum = 0;
        int l_sum = 0;   //  Sum of left side elements of index i

        // we calculate total sum
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // check equilibrium index
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];   // now totalSum = right sum

            if (l_sum == totalSum) {
                return i;        // we get equilibrium index
            }
            l_sum += arr[i];
        }

        return -1;  
    }
}
