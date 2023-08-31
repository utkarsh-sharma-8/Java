/**
 * Missing_no
 */
public class Repeated_no {
    public static int findDuplicate(int[] nums) {
        int i=0;
        int ans=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans=nums[j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));       
    }
}