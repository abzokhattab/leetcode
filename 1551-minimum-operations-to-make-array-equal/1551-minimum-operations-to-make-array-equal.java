class Solution {

    public int minOperations(int n) {
        
        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            int first = 2 * i + 1;
            int last = 2 * (n - i - 1) + 1;

            sum += (last - first) / 2;
        }
        return  sum;
    }
}
