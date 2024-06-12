import java.util.HashSet;
import java.util.Set;

public class AppearsTwice {
    public AppearsTwice(){}

    public char repeatedCharacter(String s) {
        Set<Character> exists = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            if(exists.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            exists.add(s.charAt(i));
        }  
        return s.charAt(s.length()-1); 
    }
    
}
