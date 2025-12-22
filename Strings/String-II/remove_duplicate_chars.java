// Topic: String II
// Problem: Remove duplicate characters(brute)
// Time: O(n^2), Space: O(1)

class RemoveDuplicateBrute {
    static String removeDup(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            boolean b = false;
            for (int j = 0; j < ans.length(); j++) {
                if (s.charAt(i) == ans.charAt(j)) {
                    b = true;
                    break;
                }
            }
            if (!b)
                ans += s.charAt(i);
        }
        return ans;
    }
}
