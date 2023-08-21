public class Search_In_Sorted_Roatated_Array {
    public static int binarySearch(int[] nums,int low,int high,int key){
        if(low>high){
            return -1;
        }
        int mid= (low+high)/2;
        if(nums[mid]==key){
            return mid;
        }
        if(nums[mid]>key){
            return binarySearch(nums,low,mid-1,key);
        }
        return binarySearch(nums,mid+1,high,key);
    }
    public static int pivotElement(int nums[],int low,int high){
        int mid=low+(high-low)/2;
        if(low>high){
            return -1;
        }
        if(high==low){
            return low;
        }
        if(nums[mid]<nums[(mid+1)%nums.length] && nums[mid]<nums[(mid+nums.length)%nums.length])
        {
            return mid;
        }
        if(nums[0]>nums[mid]){
            return pivotElement(nums,low,mid);
        }
        return pivotElement(nums,mid+1,high);
    }
    public static int searchElement(int[] nums, int target) {
        
        int pivot=pivotElement(nums,0,nums.length-1);
        if(pivot==-1){
            return binarySearch(nums,0,nums.length-1,target);
        }if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarySearch(nums,0,pivot,target);
        }
        return binarySearch(nums,pivot+1,nums.length-1,target);
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.print(searchElement(nums,target));
    }
}   
