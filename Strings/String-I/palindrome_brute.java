// Topic: String I
// Problem: Palindrome Check (Brute)
// Time: O(n)
// Space: O(n) [as we use another empty string to store]

class PalindromeBrute {
    static boolean isPalindrome(String s) {
      String t = "";
        for (char c : s.toCharArray())
            if (Character.isLetterOrDigit(c))
                t += Character.toLowerCase(c);

        String rev = "";

        for (int i = t.length() - 1; i >= 0; i--) {
         rev += t.charAt(i);
        }
           return t.equals(rev);
    }
}
