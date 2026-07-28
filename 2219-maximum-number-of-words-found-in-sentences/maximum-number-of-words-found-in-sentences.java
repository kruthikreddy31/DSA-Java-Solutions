class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for (String s : sentences) {
    int spaces = s.length() - s.replace(" ", "").length();
        max=Math.max(spaces,max);
}
return max+1;
    }
}