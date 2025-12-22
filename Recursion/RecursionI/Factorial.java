// Factorial using recursion
// Time: O(n), Space: O(n)

class Factorial {
    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}
