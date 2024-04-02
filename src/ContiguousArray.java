import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public ContiguousArray() {
    }
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> binaryCount = new HashMap<Integer, Integer>();
        int max = 0;
        int count = 0;
        binaryCount.put(0, -1);
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            else {
                count--;
            }
            if(binaryCount.containsKey(count)) {
                max = Math.max(max, i - binaryCount.get(count));
            }
            else {
                binaryCount.put(count, i);
            }
        }
        return max;
    }
}
