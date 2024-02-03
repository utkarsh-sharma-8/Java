import java.util.Arrays;

public class Element_in_infinite_array {
    public static void main(String[] args){
        int arr[]={2,4,5,8,10,14,17,35,456,5678,6789,78900,789011,1234567,23456789,34567890};
        Arrays.sort(arr);
        System.out.print(ans(arr,5678));
    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end- start +1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
