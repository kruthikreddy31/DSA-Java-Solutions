class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int curMax = nums[0];
        int curMin = nums[0];
        int ans1 = nums[0];
        int ans2=nums[0];

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            int tempMax = Math.max(x,
                    Math.max(curMax + x, curMin + x));

            int tempMin = Math.min(x,
                    Math.min(curMax + x, curMin + x));

            curMax = tempMax;
            curMin = tempMin;

            ans1 = Math.max(ans1, curMax);
            ans2 = Math.min(ans2, curMin);
        }
        return Math.max(Math.abs(ans1),Math.abs(ans2));

    }
}