/**
 * NextPermutation
 */
public class NextPermutation {
    public static void reverse(int[] nums,int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
    public static void nextPermutation(int[] nums) {
       int i=nums.length-2;
       if(nums==null || nums.length<=1){
           return;
       }
       while(i>=0 && nums[i]>=nums[i+1])i--;
       int j=nums.length-1;
        if(i>=0){
            while(nums[j]<=nums[i])j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }else{
           reverse(nums,0,nums.length-1);
            return;
        }
       reverse(nums,i+1,nums.length-1);
        
    }

    public static void main(String[] args) {
        int nums[]={5,4,7,5,3,2};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}