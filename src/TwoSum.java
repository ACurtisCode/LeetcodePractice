import java.util.HashMap;

public class TwoSum {
    public TwoSum(){}

    public int[] twoSum(int[] nums, int target) {
        int end = nums.length-1;

        HashMap<Integer, Integer> positions = new HashMap<>();

        for(int i=0; i<=end; i++) {
            positions.put(nums[i], i);
        }

        for(int i=0; i<end; i++) {
            int temp = target - nums[i];
            if(positions.containsKey(temp) && positions.get(temp) != i) {
                return new int[] {i, positions.get(temp)};
            }
        }
        return new int[] {};
    }
    
}
