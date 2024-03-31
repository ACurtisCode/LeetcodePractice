import java.util.*;

public class LargestUnique {
    public LargestUnique() {
    }

    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> occur = new HashMap<Integer, Integer>();
        HashSet<Integer> values = new HashSet<Integer>();
        for(int num : nums) {
            occur.put(num, occur.getOrDefault(num, 0) + 1);
        }
        for(int key : occur.keySet()) {
            if(occur.get(key) == 1) {
                values.add(key);
            }
        }
        if(!values.isEmpty()) {
            return Collections.max(values);
        }
        return -1;
    }
}
