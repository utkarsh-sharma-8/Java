public class Consecutive_difference {
    public int[] consecutive sum(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1-arr[i]];
        }
        arr=new arr(n-1);
    }
}
