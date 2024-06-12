public class MaxAvgSub {
    public MaxAvgSub(){}

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k; i++) {
            sum+=nums[i];
        }
        double answer = sum;
        for(int j=k; j<nums.length; j++) {
            sum += nums[j] - nums[j-k];
            answer = Math.max(answer, sum);
        }
        return answer/k;
    }
    
}
