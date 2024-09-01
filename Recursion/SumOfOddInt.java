package Recursion;
import java.util.Scanner;
public class SumOfOddInt {
    public static int SumOfOdd(int arr[], int n){
        int sum=0;
        if(n<=0){
            return sum;
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(SumOfOdd(arr,n));
    }
}
