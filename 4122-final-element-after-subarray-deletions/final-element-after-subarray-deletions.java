class Solution {
    public int finalElement(int[] nums) {
        int[] k = nums.clone();
        int n = k.length;
        if (n == 1) {
            return k[0];
        }
        return Math.max(k[0], k[n - 1]);
    }
}
