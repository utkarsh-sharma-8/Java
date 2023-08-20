//In this ques we have to check if the array contains same element or not//
//So we first sorted the array and then compared every element to its next element//
import java.util.Arrays;

public class Contains_Duplicate{
    public static Boolean contain(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int nums[]={1,2,3,1,4};
        Boolean ans=contain(nums);
        System.out.println(ans);;
    }
}