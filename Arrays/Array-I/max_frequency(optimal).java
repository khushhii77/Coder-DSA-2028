import java.util.HashMap;
class MaxFrequency {
    static void maxFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // we count frequency
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

       int maxCount = 0;

        // we find max-frequency
        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
            }
        }
        
        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == maxCount) {
                ans += maxCount;
            }
        }

        return ans; 
    }
}
