//in this problem we have to distribute choclate in such way each student get
// one choclate and the difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates 
// given to the students is minimum.//

import java.util.Arrays;

public class Choclate_Problem {
    public static int difference(int[] nums,int n,int m){
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
        n=nums.length;
        if(m==0 || n==0){
            return 0;
        }
        if(n<m){
            return -1;
        }
        for(int i=0;i+m-1<n;i++){
            int diff=nums[i+m-1]-nums[i];
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;
        int n=arr.length;
        System.out.println(difference(arr,n,m));
    }
}
