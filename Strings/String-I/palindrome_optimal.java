// Topic: String I
// Problem: Palindrome Check (Optimal)
// Time: O(n)
// Space: O(1)

class PalindromeOptimal {
    static boolean isPalindrome(String s) {
          int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;

             // we Convert both characters to lowercase and then compare
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;

            l++;
             r--;
        }
        return true;
    }
}
