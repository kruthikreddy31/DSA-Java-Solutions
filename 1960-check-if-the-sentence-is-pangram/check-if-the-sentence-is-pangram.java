class Solution {
    public boolean checkIfPangram(String s) {

        if(s.length()<26){
            return false;
        }
        int [] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                return false;
            }
        }
        return true;
    }
}