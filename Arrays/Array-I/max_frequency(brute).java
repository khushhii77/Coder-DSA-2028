// Topic: Array I
// Problem: Count element with maximum frequency
// Approach: Brute force frequency counting
// Time Complexity: O(n^2) .... //(n^2+n^2)
// Space Complexity: O(1)

class MaxFrequency {
    static void maxFrequency(int[] arr) {
        int maxCount = 0;
        
     //we find max freq..
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        
           // sum frequencies of elements having maxCount
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == maxCount) {
                total += count;
            }
        }

        return total;
    }
}
