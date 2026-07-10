class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        if(s/k>=threshold){
            c++;
        }
        int j=0;
        for(int i=k;i<arr.length;i++){
            s=s+arr[i]-arr[j];
            if(s/k>=threshold){
                c++;
            }
            j++;
        }
        return c;
    }
}