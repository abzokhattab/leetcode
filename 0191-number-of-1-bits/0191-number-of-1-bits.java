public class Solution {

    // you need to treat n as an unsigned value
    // 102
    // 102%100
    //     1%10

    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n & 1);
            n = n >>> 1;
        }

        return sum;
    }
}
