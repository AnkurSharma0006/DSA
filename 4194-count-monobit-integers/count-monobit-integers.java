class Solution {
    public int countMonobit(int n) {
        int a = 0;
        if (n >= 0) {
            a++;
        }
        int c = 1;
        while (c <= n) {
            a++;
            c = c * 2 + 1;
        }
        return a;
    }
}
