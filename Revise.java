public class Revise {
    public static int maximumSum(int[] arr) {
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSum(nums));
    }
}
