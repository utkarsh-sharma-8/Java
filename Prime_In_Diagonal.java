public class Prime_In_Diagonal {
    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static int diagonalPrime(int[][] nums) {
        int ax=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
                ax=Math.max(ax,nums[i][i]);
            }
            if(isPrime(nums[nums.length-i-1][i]))
            {
                ax=Math.max(ax,nums[nums.length-i-1][i]);
            }
        }
        return ax;
    }
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(nums));
    }
}
