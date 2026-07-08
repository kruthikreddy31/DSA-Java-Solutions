import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int k = s1.length();

        for (int i = 0; i < k; i++) {
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map1.equals(map2)) {
            return true;
        }

        for (int i = k; i < s2.length(); i++) {

            char add = s2.charAt(i);
            map2.put(add, map2.getOrDefault(add, 0) + 1);

            char remove = s2.charAt(i - k);
            map2.put(remove, map2.get(remove) - 1);

            if (map2.get(remove) == 0) {
                map2.remove(remove);
            }

            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}