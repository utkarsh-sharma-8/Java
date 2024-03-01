package Recursion;

public class Skip_character {
    public static void skip(String arr,int i){
        char a='a';
        if(i==arr.length()){
            return;
        }
        if(a!=arr.charAt(i)){
            System.out.print(arr.charAt(i));
        }
        skip(arr, i+1);
    }
    public static void main(String[] args) {
        String arr="baaccad";
        // System.out.print(skip(arr,0));
        skip(arr, 0);
    }
}
