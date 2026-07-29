class Solution {
    public boolean canConstruct(String r, String m) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < r.length(); i++) {
            map.put(r.charAt(i), map.getOrDefault(r.charAt(i), 0) + 1);
        }

        for (int i = 0; i < m.length(); i++) {

            if (map.containsKey(m.charAt(i))) {

                map.put(m.charAt(i), map.get(m.charAt(i)) - 1);

                if (map.get(m.charAt(i)) == 0) {
                    map.remove(m.charAt(i));
                }
            }
        }

        return map.isEmpty();
    }
}