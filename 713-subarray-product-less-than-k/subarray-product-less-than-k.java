class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     if(k==0)
     {
        return k;
     }
    int i=0;
    int j=0;
    int c=0;
    int pro=1;
    for( j=0;j<nums.length;j++)
    {
        pro*=nums[j];
        
        while(pro>=k)
        {
            pro=pro/nums[i];
            
            i++;

        }

            c += j - i + 1;
       
    }  
     return c;
    }
}