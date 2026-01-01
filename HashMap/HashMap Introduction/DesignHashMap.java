// Problem: Design HashMap (LeetCode 706)
// Description: Implement a basic HashMap without using built-in hash table libraries.
// Support put(key,value), get(key), and remove(key) operations.
// Approach: We Use a large fixed-size array based on constraints and store values directly.
// Time Complexity: O(1) average for all operations
// Space Complexity: O(N) 

class MyHashMap {
    int[] arr;

    public MyHashMap() {
        arr = new int[1000001];   // as per constraints
        for (int i = 0; i < arr.length; i++)
            arr[i] = -1;
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
        return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }
}
