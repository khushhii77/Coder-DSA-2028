// Topic: String II
// Problem: Max occurring character (Optimal)
// Time: O(n), Space: O(1)

class MaxChar {
    static char maxChar(String s) {
        int[] freq = new int[26];
        char ans = 'a';

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }
}
