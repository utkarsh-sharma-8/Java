/**
 * ceiling_of_a_no
 */
public class ceiling_of_a_no {

    public static int ceiling(int[] nums,int target){
        int n=nums.length;
        int s=0;
        int l=n-1;
        while(s<=l){
            
            int mid=(s+l)/2;
            if(target==nums[mid]){
                return nums[mid];
            }
            if(target>=nums[mid]){
                s=mid+1;
            }else if(target<nums[mid]){
                l=mid-1;
            }
        }
        return nums[s];
    }
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target=10;
        System.out.println(ceiling(arr,target));
    }
}