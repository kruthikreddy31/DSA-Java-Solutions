class Solution {
    public String customSortString(String o, String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        String a = "";

        // Append characters according to order
        for (int i = 0; i < o.length(); i++) {

            while (map.containsKey(o.charAt(i))) {

                a += o.charAt(i);

                map.put(o.charAt(i), map.get(o.charAt(i)) - 1);

                if (map.get(o.charAt(i)) == 0) {
                    map.remove(o.charAt(i));
                }
            }
        }

        // Append remaining characters
        for (char ch : map.keySet()) {

            while (map.get(ch) > 0) {
                a += ch;
                map.put(ch, map.get(ch) - 1);
            }
        }

        return a;
    }
}