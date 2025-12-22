// Print numbers from 1 to N using recursion

class Print1ToN {
    static void printTillN(int n) {
        if (n == 0) return;
        printTillN(n - 1);  //this will recursively call the function 
        System.out.print(n + " ");
    }
}
