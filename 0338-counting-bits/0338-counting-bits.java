class Solution {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) res[i] = countOnes(i);
        return res;
    }

    public int countOnes(int n) {
        int res = 0;
        while (n != 0) {
            res += (n %2);
            n = n / 2;
        }
        return res;
    }
}
