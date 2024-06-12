public class MaximumCommonVal {
    public MaximumCommonVal(){}

    public int getCommon(int[] nums1, int[] nums2) {


        for(int curr1=0, curr2=0; curr1<nums1.length && curr2<nums2.length; ) {
            if(nums1[curr1]<nums2[curr2]) {
                curr1++;
            }
            else if(nums1[curr1] == nums2[curr2]) {
                return nums1[curr1];
            }
            else {
                curr2++;
            }
        }
        
        return -1;
    }
}
