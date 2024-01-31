public class KthLargest {
    public static void main(String[] args) {
        int max=0;
        int nums[]={3,2,1,5,4,6};
        int k=3;
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1]){
                max=nums[i];
            }else{
                max=nums[i+1];
            }
        }
        int ans=max-k+1;
        System.out.println(ans);
    }
}
