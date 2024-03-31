import java.util.HashMap;
import java.util.Map;

public class MixedWord {
    public MixedWord() {
    }
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> charCount = new HashMap<Character, Integer>();
        String word = "balloon";
        int answer = 0;
        boolean status = true;
        for(char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        while(status) {
            for(char c : word.toCharArray()) {
                if (!charCount.containsKey(c)) {
                    status = false;
                    break;
                } else if (charCount.get(c) == 0) {
                    status = false;
                    break;
                } else {
                    charCount.put(c, charCount.get(c) - 1);
                }
            }
            if(status) {
                answer++;
            }
        }
    return answer;
    }
}
