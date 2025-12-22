// Topic: String II
// Problem: Count words (Brute)
// Time: O(n), Space: O(1)

class CountWordsBrute {
    static int countWords(String s) {
        int cnt = 0;
        boolean word = false;

        for (char c : s.toCharArray()) {
            if (c != ' ' && !word) {
                cnt++;
                word = true;
            } else if (c == ' ') {
                word = false;
            }
        }
        return cnt;
    }
}
