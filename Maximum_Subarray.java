public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];

            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={1,-2,3,-4,5,6,-7};
        System.out.println(maxSubArray(nums));
    }
}
