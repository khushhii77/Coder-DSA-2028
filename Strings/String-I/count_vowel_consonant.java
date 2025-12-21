// Topic: String I
// Problem: Count vowels, consonants and spaces (Optimal)
// Time Complexity: O(n)
// Space Complexity: O(1)

class CountVowelsConsonantsSpacesOptimal {
    static void count(String s) {
        int v = 0, c = 0, sp = 0;

        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {

            if (ch == ' ') {
                sp++;
            }
            else if ("aeiou".indexOf(ch) != -1) {
                v++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                c++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("White spaces: " + sp);
    }
}
