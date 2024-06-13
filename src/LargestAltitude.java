public class LargestAltitude {
    public LargestAltitude(){}
    
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int max = 0;
        for(int i=0; i<gain.length; i++) {
            altitude[i+1] = gain[i] + altitude[i];
            max = Math.max(max, altitude[i+1]);
        }
        return max;
    }
}
