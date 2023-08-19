// in this question we have to find the minimum common element of two  arrays.In the following approach we have solved using binary search.//
public class Minimum_common_value {
    public static int getCommon(int[] nums1,int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        int s1=0;
        int s2=0;
        while(s1<n1 && s2<n2){
            if(nums1[s1]==nums2[s2]){
                return nums1[s1];
            }else if(nums1[s1]>nums2[s2]){
                s2++;
            }else{
                s1++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5,6};
        int nums2[]={4,5,6,7,9,10};
        System.out.println(getCommon(nums1,nums2));
    }
}