// Fibonacci - Brute Force

class Fibonacci {
    static int f(int n) {
        if (n <= 1) return n;
        return f(n - 1) + f(n - 2);
    }
}
