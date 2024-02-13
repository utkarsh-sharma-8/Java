public class find_rotation_count {
    public static int pivot(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[mid]<=arr[s]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }return -1;
    }
    public static int rotated(int[] arr){
        int pivotElement=pivot(arr);
        if(pivotElement==-1){
            return 0;
        }else{
            return pivotElement+1;
        }
    }
    public static void main(String[] args){
        int arr[]={0,1,2,3,4};
        System.out.println(rotated(arr));
    }
}
