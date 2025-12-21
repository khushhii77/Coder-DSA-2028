// Topic: String I
// Problem: Remove non-alphabet characters
// Time: O(n)
// Space: O(n)

class RemoveNonAlphabet {
    static String clean(String s) {
        return s.replaceAll("[^a-zA-Z]", "");     //[^a-zA-Z] means anything that is NOT an alphabet
    }
}

          //OR..  WE CAN USE Loop method

class RemoveNonAlphabet {
    static String clean(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result += ch;
            }
        }
        return result;
    }
}
