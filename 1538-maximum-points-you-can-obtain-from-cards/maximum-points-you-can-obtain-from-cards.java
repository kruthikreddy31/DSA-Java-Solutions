class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int l=cardPoints.length;
     int wsum=0;
   int total=0;
     for(int i=0;i<l-k;i++){
        wsum+=cardPoints[i];
     }
    int msum=wsum;
    for(int i=0;i<l;i++){
             total+=cardPoints[i];
    }
    for(int i=l-k;i<l;i++){
            wsum+=cardPoints[i]-cardPoints[i - (l-k)];
            msum=Math.min(msum,wsum);
    }
    return total-msum;
    }
}