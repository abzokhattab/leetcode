class Solution {
// 2 -1 -1
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (sum(gas) < sum(cost)) return -1;

        for (int i = 0; i < gas.length; i++) {
            gas[i] -= cost[i];
        }

        int curSum = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            if (curSum < 0) {
                curSum = 0;
                index = i;
            }
            curSum += gas[i];
        }
   
        return index;
    }

    public int sum(int[] a) {
        int s = 0;
        for (int el : a) {
            s += el;
        }
        return s;
    }
}
