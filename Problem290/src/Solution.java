import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] keys = pattern.toCharArray();
        String[] values = str.split(" ");

        if (keys.length != values.length) return false;
        Map<Character, String> info = new HashMap<>();

        for (int i = 0; i < values.length; i++) {
            if (info.containsValue(values[i])) {
                if (info.get(keys[i]) == null || !info.get(keys[i]).equals(values[i])) {
                    return false;
                }
            } else if (info.containsKey(keys[i])) {
                return false;
            } else info.put(keys[i], values[i]);
        }
        return true;
    }
}
