public class ReversePrefix {
    public ReversePrefix () {}

    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        boolean isFound = false;
        
        for(char c : word.toCharArray()) {
            ans.append(c);
            if(c == ch && isFound == false) {
                ans.reverse();
                isFound = true;
            }
        }
        return ans.toString();
    }
}
