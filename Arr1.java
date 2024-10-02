public class Arr1 {
    public static int findCount(int arr[], int length,int num,int diff){
        int ans=0;
        for(int i=0;i<length;i++){
            if(Math.abs(arr[i]-num)<=diff){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={12,3,14,56,77,13};
        System.out.println(findCount(arr, 6, 13, 2));
    }
}
