// Topic: String I
// Problem: Palindrome Check (Brute)
// Time: O(n)
// Space: O(n) [as we use rev to store]

class PalindromeBrute {
    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }
}
