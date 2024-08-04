import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],(map.get(nums[i]))+1);
            }else{
                map.put(nums[i],1);
            }
        }for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                p=nums[i];
            }
        }return p;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1};
        System.out.println(singleNumber(nums));
    }
}


//return the value of thee array that appears for once only
