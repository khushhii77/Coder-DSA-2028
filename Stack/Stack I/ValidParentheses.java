// Topic: Stack I
// Problem: Valid Parentheses
// Approach: Use stack to match brackets
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;

                char t = st.pop();

                if(c==')' && t!='(') return false;
                if(c=='}' && t!='{') return false;
                if(c==']' && t!='[') return false;
            }
        }

        return st.isEmpty();
    }
}
