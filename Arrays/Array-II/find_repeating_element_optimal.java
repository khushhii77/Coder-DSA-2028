// Topic: Array II
// Problem: Find repeating element in array
// Approach: Frequency array (optimal)
// Time Complexity: O(n)
// Space Complexity: O(n)

class FindRepeatingOptimal {
    public static int findRepeating(int[] arr) {
        int[] freq = new int[100000 + 1];

        for (int x : arr) {
            if (freq[x] == 1) {
                return x;
            }
            freq[x]++;
        }
        return -1;
    }
}
