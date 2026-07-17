class Solution {
    public int longestOnes(int[] nums, int k) {

        int i = 0;
        int t = 0;
        int max = 0;
        int n = nums.length;

        for (int j = 0; j < n; j++) 
        {

            if (nums[j] == 0) 
            {
                t++;
            }

            while (t > k) 
            {
                if (nums[i] == 0) 
                {
                    t--;
                }
                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}