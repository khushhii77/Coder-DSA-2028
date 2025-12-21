// Topic: Array III
// Problem: Union of two sorted arrays
// Approach:  using Set
// Time Complexity:  O( (m+n)log(m+n) )
// Space Complexity: O(n+m)

import java.util.*;

class UnionSortedArraysBrute {
    public List<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> st = new TreeSet<>();   // we use Set to store unique sorted elements

        for (int num : arr1) {
            st.add(num);
        }
        for (int num : arr2) {
            st.add(num);
        }

        //now we will Convert set back to the list
        return new ArrayList<>(st);
    }
}
