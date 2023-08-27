import java.util.Arrays;

public class LongestCommon {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length - 1];

        int n = 0;
        while (n<f.length() && n<l.length()){
            if(f.charAt(n) == l.charAt(n)){
                n++;
            }else{
                break;
            }
        }
        return f.substring(0,n);
    }
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.print(longestCommonPrefix(strs));
    }
}
