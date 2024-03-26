import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public PangramCheck() {
    }

    public boolean CheckPangram(String s) {
        Set<Character> chars = new HashSet<>();

        for (char c: s.toCharArray()) {
            if(!chars.contains(c)) {
                chars.add(c);
            }
        }
        if(chars.size() == 26) {
            return true;
        }
        return false;
    }
}
