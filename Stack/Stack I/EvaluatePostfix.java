// Topic: Stack I
// Problem: Evaluate Postfix Expression
// Description: Evaluate expression like "231*+9-"
// Approach: Push numbers, on operator pop two and compute
// Time Complexity: O(n)

import java.util.*;

class EvaluatePostfix {
    public int eval(String s){
        Stack<Integer> st = new Stack<>();

       for (String s : arr) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/") && !s.equals("^")) {
                st.push(Integer.parseInt(s));
            } 
            else {
                int b = st.pop();
                int a = st.pop();
                int res = 0;

                if (s.equals("+")) res = a + b;
                else if (s.equals("-")) res = a - b;
                else if (s.equals("*")) res = a * b;
                else if (s.equals("/")) {

                    res = a / b;

                    if ((a ^ b) < 0 && a % b != 0) {
                        res--;
                    }
                }
                else if (s.equals("^")) {
                    res = (int)Math.pow(a, b);
                }

                st.push(res);
            }
        }

        return st.pop();
    }
}
