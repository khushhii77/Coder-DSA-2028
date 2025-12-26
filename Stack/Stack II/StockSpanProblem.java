// Topic: Stack II
// Problem: Online Stock Span
// Description: For each day, return number of consecutive days before it including today where price <= today's price
// Approach: We Use stack storing (price, span)
// Pop while previous price <= current price and add spans
// Time Complexity: O(n) total (amortized O(1))
// Space Complexity: O(n)

import java.util.*;

class StockSpanner {
    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }
        st.push(new int[]{price, span});

        return span;
    }
}
