import java.util.HashMap;
import java.util.Set;

public class Valid_Anagram {
    class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt[i])){
                map.put(s.charAt[i],map.get(s.charAt[i]+1));
            }else{
                map.put(s.charAt[i],1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt[i])){
                map.put(t.charAt[i],map.get(t.charAt[i]-1));
            }else{
                map.put(t.charAt[i],1);
            }
        }
        Set<Character> p=map.keySet();
        for(Character p:keys){
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}
}
