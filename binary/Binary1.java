/**
 * Binary1
 */
public class Binary1 {

    public static int operationBinaryString(String str){
        if(str.length()==0){
            return -1;
        }
        int result = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i += 2) {
            char operator = str.charAt(i);
            int nextNum = str.charAt(i + 1) - '0'; 
            if (operator == 'A') {
                result &= nextNum;
            } else if (operator == 'B') {
                result |= nextNum;
            } else if (operator == 'C') {
                result ^= nextNum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str="1C0C1C1A0B1";
        System.out.println(operationBinaryString(str));
    }
}