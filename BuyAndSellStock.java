public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        //lsf is least so far
        int lsf=Integer.MAX_VALUE;
        //op is overall profit
        int op=0;
        //pist is profit if sold today
        int pist=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            pist=prices[i]-lsf;
            if(pist>op){
                op=pist;
            }
        }
        return op;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
