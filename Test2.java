public class Test2 {
    public static int test(int nums[]){
        int pivot=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[(i-1)%nums.length] && nums[i]<=nums[(i+1)%nums.length]){
                pivot=i;
            }
        }
        return pivot;
    }
    public static void  main(String[] args){
        int nums[]={6,10,6};
        System.out.println(test(nums));
    }
}
