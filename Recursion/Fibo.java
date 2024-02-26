package Recursion;

public class Fibo {
    static int number(int n){
        if(n<2){
            return n;
        }
        return number(n-1)+number(n-2);
    }
    public static void main(String[] args){
        System.out.println(number(4));
    }
}
