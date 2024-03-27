import java.util.HashSet;
import java.util.Set;

public class CountSequence {
    public CountSequence() {
    }

    public int CountElements(int [] arr) {
        Set<Integer> nums = new HashSet<>();
        int ans = 0;

        for(int num: arr) {
            nums.add(num);
        }

        for(int i=0; i<arr.length; i++) {
            if(nums.contains(arr[i]) && nums.contains(arr[i]+1)) {
                ans++;
            }
        }
        return ans;
    }
}
