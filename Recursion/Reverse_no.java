package Recursion;

public class Reverse_no {
    static int sum=0;
    public static void reverse(int n){
        if(n==0){
            return ;
        }
        int p=n%10;
        n=n/10;
        
        sum=sum*10+p;
        reverse(n);
        
        // return q;
    }
    public static void main(String[] args){
        reverse(1204);
        System.out.println(sum);
    }
}
