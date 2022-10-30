class Solution {

    //10,9,2,5
    //10

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);

        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i]=dp[j]+1;
                }
                max = Math.max(max, dp[i]);
            }
        }

        return max;
    }
    //     public int getLongestSequence(int[] nums, int i, int prevIndex, int n) {
    //         if (i >= n) return 0;

    //         if (memo[i][prevIndex + 1] != -1) return memo[i][prevIndex + 1];

    //         int picked = 0;
    //         int notPicked = getLongestSequence(nums, i + 1, prevIndex, n);
    //         if (prevIndex == -1 || nums[i] > nums[prevIndex]) picked = getLongestSequence(nums, i + 1, i, n) + 1;

    //         int result = Math.max(picked, notPicked);

    //         memo[i][prevIndex + 1] = result;

    //         return result;
    //     }
}
