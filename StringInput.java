import java.util.HashMap;
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        HashMap<String,Integer> map=new HashMap<>();
        int i=0;
        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }

            if (i >= str.length()) {
                break;
            }

            int j = i;
            while (j < str.length() && str.charAt(j) != ' ') {
                j++;
            }

            String word = str.substring(i, j);
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

            i = j;
        }
        for(HashMap.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
