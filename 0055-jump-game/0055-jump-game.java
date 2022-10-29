class Solution {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int targetIndex = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] + i >= targetIndex) targetIndex = i;
        }

        return (targetIndex == 0) ? true : false;
    }
}
