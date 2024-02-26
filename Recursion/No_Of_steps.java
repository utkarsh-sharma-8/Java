package Recursion;

public class No_Of_steps {

    // public static int number(int n){
    //     int step=0;
    //     while(n>0){
    //         if(n%2==0){
    //             n=n/2;
    //             step++;
    //         }else{
    //             n=n-1;
    //             step++;
    //         }
    //     }
    //     return step;
    // }
    public static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }else{
            return helper(num-1,steps+1);
        }
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static void main(String[] args){
        System.out.println(numberOfSteps(14));
    }
}
