class Solution {

    public int[] plusOne(int[] nums) {
        int i = nums.length - 1;

        while (i >= 0 && nums[i] == 9) {
            nums[i] = 0;
            i--;
        }
        if (i == -1) {
            int[] res = new int[nums.length + 1];
            res[0] = 1;
            for (int j = 1; j < res.length; j++) res[j] = nums[j - 1];
            return res;
        }

        nums[i]++;
        return nums;
    }
}
