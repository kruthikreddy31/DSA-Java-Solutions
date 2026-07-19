import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i=0,x=0;
        while(i<n && nums[i]<=target){
            if(nums[i]==target)
                return i;
                i++;
                x++;
        }
        return x;
    }
}