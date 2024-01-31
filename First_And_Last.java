public class First_And_Last {
//in this ques we have to find the first and last position of target in arr 
    public static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }  
    public static int search(int[] nums,int target,boolean findStartIndex){
        int s=0;
        int l=nums.length-1;
        int ans=-1;
        while(s<=l){
            int mid=(s+l)/2;
            if(target<nums[mid]){
                l=mid-1;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                ans=mid;
                if(findStartIndex){
                    l=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    } 
    public static void main(String[] args){
        int[] arr={5,7,7,7,7,7,8,8,10};
        int[] nums=searchRange(arr,7);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        
        
    }
}
