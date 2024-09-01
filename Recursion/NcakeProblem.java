package Recursion;

public class NcakeProblem{
    public static long solution(int n){
        long M=1000000007;
        if(n==1){
            return 2;
        }if(n==0){
            return 1;
        }
        return (n+solution(n-1))%M;
    }

    public static void main(String[] args){
        int n=5;
        System.out.println(solution(n));
    }
}