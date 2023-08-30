import java.util.Arrays;

public class Cycle_sort {

    public static void sort(int[] nums){
        int i=0;
        while(i<=nums.length-1){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums={3,5,2,1,4};
        sort(nums);   
        System.out.print(Arrays.toString(nums));
    }
}
