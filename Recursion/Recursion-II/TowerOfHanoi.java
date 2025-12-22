// Tower of Hanoi ... it states minimum no.of moves

class TowerOfHanoi {
    static long toh(int n) {
        if (n == 0) return 0;
        return 2 * toh(n - 1) + 1;
    }
}
