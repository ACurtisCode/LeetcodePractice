public class EqualSubstring {
    public EqualSubstring(){}
    
    public int equalSubstring(String s, String t, int maxCost) {
        int right = 0;
        int left = 0;
        int cost = 0;
        int ans = 0;
        while(right<=s.length()) {
            cost += Math.abs((int)s.charAt(right) - (int)t.charAt(right));
            while(cost > maxCost) {
                cost -= Math.abs((int)s.charAt(left) - (int)t.charAt(left));
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
            
        }
        return ans;
    }
}
