package Recursion;

public class MregionProblem {
    public static void main(String[] args){
        int n=4;
        System.out.println(sol(n));
    }
    public static int sol(int n){
        int num;
        num=n*(n+1)/2+1;
        return num;
    }
}
