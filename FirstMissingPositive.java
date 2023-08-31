public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int i=0;
       while(i<nums.length){
           int correct=nums[i]-1;
           if(nums[i]<nums.length && nums[i]>0 && nums[i]!=nums[correct]){
               int temp=nums[i];
               nums[i]=nums[correct];
               nums[correct]=temp;
           }else{
               i++;
           }
       }
       int ans=0;
       for(int j=0;j<nums.length;j++){
           if(nums[j]!=j+1){
               ans=j+1;
               break;
           }
       }
       if(nums.length==1){
           if(nums[0]==1){
               ans=2;
           }else{
               ans=1;
           }
       }
       if(ans==0){
           ans=nums.length+1;
       }
       return ans;
   }
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));   
    }
}
