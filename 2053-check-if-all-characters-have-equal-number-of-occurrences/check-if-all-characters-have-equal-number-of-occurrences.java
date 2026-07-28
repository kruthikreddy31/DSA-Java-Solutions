class Solution {
    public boolean areOccurrencesEqual(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int c=0;
       for (int value : map.values()) {
        if(c==0){
            c=value;
            continue;
        }
        if(c!=value){
            return false;
        }
        
}
return true;
    }
}