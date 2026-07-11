class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Keep window size = k
            if (i >= k) {
                sum -= nums[i - k];

                map.put(nums[i - k], map.get(nums[i - k]) - 1);

                if (map.get(nums[i - k]) == 0) {
                    map.remove(nums[i - k]);
                }
            }

            // Check if window has k distinct elements
            if (i >= k - 1 && map.size() == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}