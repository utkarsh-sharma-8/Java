public class Search_In_Sorted_Roatated_Array_test {
    public static int pivot(int[] arr){
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
    public static int search(int[] arr,int target){
        int s;
        int e;
        int pivotElement=pivot(arr);
        if(target<arr[0]){
            s=pivotElement+1;
            e=arr.length-1;
        }else{
            s=0;
            e=pivotElement;
        }
        if(arr.length==1 && target==pivotElement){
            return pivotElement;
        }
        if(pivotElement==-1){
            s=0;
            e=arr.length-1;
        }
        while(s<=e){
            int mid=(s+e)/2;
            if(target<arr[mid]){
                e=mid-1;
            }else if(target>arr[mid]){
                s=mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        int arr2[]={3,1};

        System.out.println(search(arr2,3));
        System.out.println(pivot(arr2));

    }
}
