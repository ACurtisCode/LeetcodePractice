import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public MissingNumber() {
    }

    public int CheckNums(int [] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }

        for(int i=0; i<nums.length; i++) {
            if(!numSet.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }
}
