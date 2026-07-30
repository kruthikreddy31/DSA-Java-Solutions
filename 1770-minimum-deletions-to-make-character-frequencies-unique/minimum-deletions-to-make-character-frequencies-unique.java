class Solution {
    public int minDeletions(String s) {
        int [] a=new int[26];
        for(char ch:s.toCharArray()){
            a[ch-'a']++;
        }
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for (int f : a) {

            while (f > 0 && set.contains(f)) {
                f--;
                ans++;
            }

            if (f > 0) {
                set.add(f);
            }
        }

        return ans;
    }
}