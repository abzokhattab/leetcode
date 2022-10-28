class Solution {
    static int[][] memo;

    public int lengthOfLIS(int[] nums) {
        memo = new int[nums.length][nums.length + 1];

        for (int[] row : memo) Arrays.fill(row, -1);

        return getLongestSequence(nums, 0, -1, nums.length);
    }

    public int getLongestSequence(int[] nums, int i, int prevIndex, int n) {
        if (i >= n) return 0;

        if (memo[i][prevIndex + 1] != -1) return memo[i][prevIndex + 1];

        int picked = 0;
        int notPicked = getLongestSequence(nums, i + 1, prevIndex, n);
        if (prevIndex == -1 || nums[i] > nums[prevIndex]) picked = getLongestSequence(nums, i + 1, i, n) + 1;

        int result = Math.max(picked, notPicked);

        memo[i][prevIndex + 1] = result;

        return result;
    }
}
