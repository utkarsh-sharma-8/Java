public class CheckRotated {
    public static boolean check(int[] nums) {
        int pivot=-1;
        int j=0;
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[(i-1)%nums.length] && nums[i]<=nums[(i+1)%nums.length]){
                pivot=i;
            }
        }
        if(pivot==-1){
            while(j<nums.length-1){
                if(nums[j]<=nums[j+1]){
                    j++;
                }else {
                    return false;
                }
            }
            return true;
        }else{
            if(nums[nums.length-1]<=nums[0]){
                while(k<pivot-1){
                    if(nums[k]<=nums[k+1]){
                        k++;
                    }else {
                        return false;
                    }
                }
                int x=pivot;
                while(x<nums.length-1){
                    if(nums[x]<=nums[x+1]){
                        x++;
                    }else {
                        return false;
                    }
                }
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args){
        int[] nums={6,10,6};
        System.out.println(check(nums));
    }
}
