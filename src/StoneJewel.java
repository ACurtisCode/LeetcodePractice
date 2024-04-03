import java.util.HashMap;
import java.util.Map;

public class StoneJewel {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> jewelMap = new HashMap<>();
        int ans = 0;
        for(char c : jewels.toCharArray()) {
            jewelMap.put(c, 0);
        }
        for(char c : stones.toCharArray()) {
            if(jewelMap.containsKey(c)) {
                jewelMap.put(c, jewelMap.get(c) + 1);
            }
        }
        for(int count : jewelMap.values()) {
            ans += count;
        }
        return ans;
    }
}
