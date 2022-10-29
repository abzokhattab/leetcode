class Solution {
    // sum = nums[i]-i
    static int memo[];

    public boolean canJump(int[] nums) {
        int n = nums.length;
        memo = new int[n];
       // int dp[] = new int[n];
        //dp[n - 1] = true;
        int sum = nums[0];
        // for (int i = 1; i < n; i++) {
        //     if (sum - 1 <= 0) return false;
        //     sum = sum - 1 + nums[i];
        // }
        return (canJumpHelper(nums, 0) == 1) ? true : false;
        //return true;
        //          for(int i= n-2;i>=0;i--){
        //              for (int i = 0 ;i<)

        //          }

    }

    public int canJumpHelper(int[] nums, int j) {
        if (j >= nums.length - 1) return 1;

        if (memo[j] != 0) return memo[j];

        for (int i = 1; i <= nums[j]; i++) {
            if (canJumpHelper(nums, j + i) ==1 ) {
                memo[j] = 1;
                return 1;
            }
        }

        memo[j] = 2;
        return 2;
    }
}
