package Recursion;

import java.util.Scanner;

public class SuperiorElement {
    public static int superior(int[] arr,int n){
        int ans=0;
        int max=0;
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                ans++;
                max=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
                ans++;
            }
        }
        return ans;
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
        System.out.println(superior(arr,n));
    }
}
