import java.util.ArrayList;
import java.util.List;

public class All_Missing {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);   
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
