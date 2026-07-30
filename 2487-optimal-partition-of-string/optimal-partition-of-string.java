class Solution {
    public int partitionString(String s) {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(set.contains(ch)){
                set.clear();
                set.add(ch);
                ans++;
            }
            else{
                set.add(ch);
            }
        }
        return ans+1;
    }
}