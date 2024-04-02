import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> note = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            note.put(c, note.getOrDefault(c, 0) + 1);
        }
        for(char c : ransomNote.toCharArray()) {
            if(!note.containsKey(c)) {
                return false;
            }
            note.put(c, note.get(c) - 1);
            if(note.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
