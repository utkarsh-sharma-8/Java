public class Maximum_Minimum {
    public static int minimum(int []nums1){
        int key=Integer.MAX_VALUE;
        int i=0;
        while(i<nums1.length){
            if(key>nums1[i]){
                key=nums1[i];
            }
            i++;
        }
        return key;
    }
    public static int maximum(int[] nums){
        int key=Integer.MIN_VALUE;
        int i=0;
        while(i<nums.length){
            if(key<nums[i]){
                key=nums[i];
            }
            i++;
        }return key;
    }
    public static void main(String[] args) {
        int nums1[]={5,7,2,4,8};
        System.out.println("The minimum value is: "+minimum(nums1));
        System.out.println("The maximum value is :"+maximum(nums1));
    }
}
