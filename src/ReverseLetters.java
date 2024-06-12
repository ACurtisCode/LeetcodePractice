public class ReverseLetters {
    public ReverseLetters(){}

    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder ans = new StringBuilder(s);

        while(left<right) {
            char charL = ans.charAt(left);
            char charR = ans.charAt(right);

            if(!Character.isLetter(charL)) {
                left++;
            }
            else if(!Character.isLetter(charR)){
                right--;
            }
            else {
                ans.setCharAt(left, charR);
                ans.setCharAt(right, charL);
                left++;
                right--;
            }
        }

        return ans.toString();
    }
}
