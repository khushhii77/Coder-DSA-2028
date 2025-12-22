// Topic: String II
// Problem: Calculate frequency of characters (Brute)
// Time: O(n^2), Space: O(1)

class CharFrequencyBrute {
    static void frequency(String s) {
        int n = s.length();
       boolean[] ans = new boolean[n];

  for (int i = 0; i < n; i++) {
    if (ans[i]) continue;

    int cnt = 1;

    for (int j = i + 1; j < n; j++) {
        if (s.charAt(i) == s.charAt(j)) {
            cnt++;
            ans[j] = true;
        }
    }

    System.out.println(s.charAt(i) + " : " + cnt);
}

        }
    }
}
