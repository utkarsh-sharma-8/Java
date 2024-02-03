public class Peak_index_arr {
    public static int peak(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]>arr[mid+1]&& arr[mid]<arr[mid-1]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={0,5,10,5,2};
        System.out.print(peak(arr));
    }
}
