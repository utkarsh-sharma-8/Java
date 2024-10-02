public class DecToNBase {
    public static String DecTonBase(int n,int num){
        StringBuilder st=new StringBuilder();
        String chars="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(num!=0){
            int rem=num%n;
            num=num/n;
            st.append(chars.charAt(rem));
        }
        return st.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(DecTonBase(21,5678));
    }
}
