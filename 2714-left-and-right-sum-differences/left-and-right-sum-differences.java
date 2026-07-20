class Solution {
    public int[] leftRightDifference(int[] nums) {

        int rsum = 0;

        for (int num : nums)
            rsum += num;

        int lsum = 0;

        for (int i = 0; i < nums.length; i++) {
            rsum -= nums[i];          
            int curr = nums[i];     
            nums[i] = Math.abs(lsum - rsum);
            lsum += curr;              
        }
        return nums;
    }
}