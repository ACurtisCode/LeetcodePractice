import java.util.HashSet;
import java.util.Set;

public class MaxVowel {
    public MaxVowel(){}
    
    public int maxVowels(String s, int k) {
        int count = 0;
        int ans = 0;
        int left = 0;
        int right = 0;
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while(right<s.length()) {
            while((right-left) > k) {
                if(vowels.contains(s.charAt(left))) {
                    count--;
                }
                left++;
            }
            if(vowels.contains(s.charAt(right))) {
                count++;
                ans = Math.max(ans, count);
            }
            right++;

        }
        return ans;
    }
    
}
