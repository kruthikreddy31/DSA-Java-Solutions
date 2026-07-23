class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
        int v1=sum+nums[i];
        int v2=nums[i];
        sum=Math.max(v1,v2);
        res=Math.max(sum,res);
        }
        return res;
    }
}