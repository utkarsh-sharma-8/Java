public class FurnishingCompany {
    public static int aqua(String s,int l){
        int ans=0;
        for(int i=0;i<s.length();i++){
            StringBuilder str=new StringBuilder("");
            int count=0;
            if(i+l<s.length()){
                str.append(s.substring(i,i+l+1));
            }else{
                str.append(s.substring(i,s.length()));
            }
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='a'){
                    count++;
                }
                
            }
            ans=Math.max(ans, count);
            i=i+l;

        }

        return ans;
    }
    public static void main(String[] args){
        String str="abbbaabbb";
        int ans=aqua(str, 3);
        System.out.println(ans);
    }
}
