import java.util.Arrays;

public class MergeSort {
    //in o(N) space-complexity
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] left,int[] right){
        int[] ans=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k++]=left[i++];
            }else{
                ans[k++]=right[j++];
            }
        }
        while(i<left.length){
            ans[k++]=left[i++];
        }
        while(j<right.length){
            ans[k++]=right[j++];
        }
        return ans;
    }

    //in o(1) space-complexity
    public static void divide(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(e+s)/2;
        divide(arr,s,mid);
        divide(arr,mid,e);
        conquer(arr,s,mid,e);
    }
    public static void conquer(int[] arr,int s,int mid,int e){
        int[] ans=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                ans[k++]=arr[i++];
            }else{
                ans[k++]=arr[j++];
            }
        }
        while(i<mid){
            ans[k++]=arr[i++];
        }while(j<e){
            ans[k++]=arr[j++];
        }
        for(int l=0;l<ans.length;l++){
            arr[s+l]=ans[l];
        }
    }
    public static void  main(String[] args){
        int[] arr={3,4,2,1,5,6};
        divide(arr, 0, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
