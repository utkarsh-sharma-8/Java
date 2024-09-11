public class SumOfBinary{
    public static int findBinary(int n){
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            int res=n%2;
            sb.append(res);
            n=n/2;
        }
        sb.reverse();
        int binary=Integer.parseInt(sb.toString());
        return binary;
    }
    public static int findSum(int n){
        int ans=0;
        while(n!=0){
            ans+=n%10;
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=15;
        int st=findBinary(n);
        System.out.println(findSum(st));
    }
}