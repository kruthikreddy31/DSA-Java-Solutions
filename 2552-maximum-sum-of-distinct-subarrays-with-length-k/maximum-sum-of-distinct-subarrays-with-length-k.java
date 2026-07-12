class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long ans = 0;
        long currSum = 0;

        int begin = 0;
        int end = 0;

        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        while (end < nums.length) {

            int curr = nums[end];
            int lastIndex = lastSeen.getOrDefault(curr, -1);

            while (lastIndex >= begin || (end - begin + 1) > k) {
                currSum -= nums[begin];
                begin++;
            }

            currSum += nums[end];
            lastSeen.put(curr, end);
            if (end - begin + 1 == k) {
                ans = Math.max(ans, currSum);
            }

            end++;
        }

        return ans;
    }
}