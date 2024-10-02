public class Test2 {
    public static int test(int m,int n){
        int fourDivisible=0;
        int sevenDivisible=0;
        
        for(int i=m;i<=n;i++){
            if(i%4==0){
                fourDivisible=i;
            }if(i%7==0){
                sevenDivisible=i;
            }

        }
    }
    public static void  main(String[] args){
        int nums[]={6,10,6};
        System.out.println(test(nums));
    }
}
