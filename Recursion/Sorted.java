package Recursion;

public class Sorted {
    public static void main(String[] args){
        int arr[]={1,2,3,4,9,8};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[] num,int index){
        if(index==num.length-1){
            return true;
        }
        return num[index]<num[index+1] && sorted(num,index+1);
    }
}
