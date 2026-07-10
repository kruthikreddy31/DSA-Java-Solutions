class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=""+num;
        int j=0;
        int c=0;
        for(int i=k;i<=s.length();i++){
            int r=Integer.parseInt(s.substring(j,i));;
            if(r==0){
                j++;
                continue;
            }
            else{
                if(num%r==0){
                    c++;
                }
                j++;
            }
        
        }
        return c;

    }
}