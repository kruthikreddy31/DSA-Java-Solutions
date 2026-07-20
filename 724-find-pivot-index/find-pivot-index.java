class Solution {
    public int pivotIndex(int[] nums) {

        int leftsum = 0;
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        for (int j = 0; j < nums.length; j++) {

            int rightsum = total - nums[j] - leftsum;

            if (leftsum == rightsum) {
                return j;
            }

            leftsum += nums[j];
        }

        return -1;
    }
}