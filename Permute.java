import java.util.Arrays;

public class Permute{
    public static Boolean sort(int[] nums1,int[] nums2,int k){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j=nums2.length-1;
        int i=0;
        while(i<=j){
            int temp=nums2[i];
            nums2[i]=nums2[j];
            nums2[j]=temp;
            j--;
            i++;
        }
        for(int p=0;p<nums1.length;p++){
            if(nums1[p]+nums2[p]<k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums1[]={2, 1, 3};
        int nums2[]={7, 7, 9};
        int k=10;
        System.out.print(sort(nums1,nums2,k));
    }
}