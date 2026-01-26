import java.util.*;

class Solution {
    private int[][] rects;
    private int[] prefix;
    private Random rand;

    public Solution(int[][] rects) {
        this.rects = rects;
        this.rand = new Random();
        this.prefix = new int[rects.length];

        for (int i = 0; i < rects.length; i++) {
            int[] r = rects[i];
            int width = r[2] - r[0] + 1;
            int height = r[3] - r[1] + 1;
            int area = width * height;
            prefix[i] = area + (i > 0 ? prefix[i - 1] : 0);
        }
    }

    public int[] pick() {
        int total = prefix[prefix.length - 1];
        int target = rand.nextInt(total) + 1;

        int idx = Arrays.binarySearch(prefix, target);
        if (idx < 0) {
            idx = -idx - 1;
        }

        int[] rect = rects[idx];
        int x = rect[0] + rand.nextInt(rect[2] - rect[0] + 1);
        int y = rect[1] + rand.nextInt(rect[3] - rect[1] + 1);

        return new int[] {x, y};
    }
}