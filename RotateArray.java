public class RotateArray {
    public static void rotate(int[] nums,int k) {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        // for(int i=k;i<nums.length;i++){
        //     int temp=nums[k];
        //     nums[k]=nums[nums.length-i];
        //     nums[nums.length-i]=temp;
        // }
        reverse(nums,k,nums.length-1);
    }   

    public static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums,3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

