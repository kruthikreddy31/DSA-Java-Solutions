class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int c=0;
        int max=0;
        int n=nums.length;
        for(int j=0;j<n;j++)
        {
            if(nums[j]==0)
            {
                c++;
            }
            if(c>1)
            {
                while(c>1)
                {
                    if(nums[i]==0)
                    {
                        c--;
                    }
                    i++;
                }
            }
            max=Math.max(max,j-i+1);
        }
        return max-1;
    }
}