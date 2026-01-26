import java.util.*;

class Solution {
    private int[] prefix;
    private Random rand;

    public Solution(int[] w) {
        prefix = new int[w.length];
        prefix[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            prefix[i] = prefix[i - 1] + w[i];
        }
        rand = new Random();
    }

    public int pickIndex() {
        int target = rand.nextInt(prefix[prefix.length - 1]) + 1;
        int idx = Arrays.binarySearch(prefix, target);
        if (idx < 0) idx = -idx - 1;
        return idx;
    }
}