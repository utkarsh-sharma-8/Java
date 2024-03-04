package Recursion;

public class Subsequence {
    public static void main(String[] args){
        subSeq("abc","");
    }
    public static void subSeq(String s,String ans){
        // System.out.println(s.substring(1));
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=s.charAt(0);
        subSeq(s.substring(1),ans+ch);
        subSeq(s.substring(1),ans);
    }
}
