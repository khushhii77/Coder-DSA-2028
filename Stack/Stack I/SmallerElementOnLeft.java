// Use stack to maintain increasing order
// TC: O(n)
// SC: O(n)

import java.util.*;

class SmallerElementOnLeft {
    public int[] smaller(int[] arr){

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(arr[i]);
        }

        return ans;
    }
}
