// Topic: Stack II
// Problem: Asteroid Collision
// Description: Positive -> moving right, Negative -> moving left
// Collide only when right meets left, Bigger survives or both explode if equal
// Approach: we Use stack to maintain surviving asteroids
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int x : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && x < 0 && st.peek() > 0) {
                if (st.peek() < -x) {
                    st.pop();
                    continue;
                }
                else if (st.peek() == -x) {
                    st.pop();
                }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                st.push(x);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
