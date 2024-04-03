import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public LongestSubstring() {
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        int start = 0;
        int ans = 0;
        int count = 0;
        char[] chars = s.toCharArray();
        if(s.length() == 0) {
            return 0;
        }
        for(int i=0; i<s.length(); i++) {
            charCount.put(chars[i], charCount.getOrDefault(chars[i], 0) + 1);
            count++;
            if(charCount.get(chars[i]) > 1) {
                count--;
                ans = Math.max(count, ans);
                while (charCount.get(chars[i]) > 1) {
                    charCount.put(chars[start], charCount.get(chars[start]) - 1);
                    start++;
                }
            }
        }
        return ans;

    }
}
