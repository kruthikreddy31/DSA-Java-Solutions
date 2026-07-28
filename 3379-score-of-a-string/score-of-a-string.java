class Solution {
    public int scoreOfString(String s) {
        Character prev=s.charAt(0);
        int score=0;
        for(int i=1;i<s.length();i++){
            int temp=prev-s.charAt(i);
            score+=Math.abs(temp);
            prev=s.charAt(i);
        }
        return score;
    }
}