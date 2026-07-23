class Solution {
    public int maxProduct(int[] nums) {

        int curMax = nums[0];
        int curMin = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            int tempMax = Math.max(x,
                    Math.max(curMax * x, curMin * x));

            int tempMin = Math.min(x,
                    Math.min(curMax * x, curMin * x));

            curMax = tempMax;
            curMin = tempMin;

            ans = Math.max(ans, curMax);
        }

        return ans;
    }
}