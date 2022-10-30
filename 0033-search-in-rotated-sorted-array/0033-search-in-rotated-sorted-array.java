class Solution {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = -1; 
        while (r >= l) {
              m = (r + l) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[l]<=nums[m]){
                if (target > nums[m] || target < nums[l])
                    l = m +1;
                else 
                    r = m-1;
                
            }else {
                if( target < nums[m]||target >nums[r]){
                    r= m-1;
                }else l=m+1;
                
            }

        }
        return -1;
    }
}
