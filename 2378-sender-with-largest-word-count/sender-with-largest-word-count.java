class Solution {
    public String largestWordCount(String[] messages, String[] senders) {

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < messages.length; i++) {

            int words = messages[i].split(" ").length;

            map.put(
                senders[i],
                map.getOrDefault(senders[i], 0) + words
            );
        }


        String ans = "";
        int max = 0;
        for(String sender : map.keySet()) {

            int count = map.get(sender);

            if(count > max) {

                max = count;
                ans = sender;

            } 
            else if(count == max) {

                if(sender.compareTo(ans) > 0) {
                    ans = sender;
                }
            }
        }

        return ans;
    }
}