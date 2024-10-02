import java.util.Stack;

public class EvenThenOddSort {
    public static int[] sort(int[] arr){
        int[] newArr=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int j=0;
        int i=0;
        while(i<arr.length){
            if(st.isEmpty()){
                if(arr[i]%2==0){
                    st.push(arr[i]);
                }
            }
            else{
                if(arr[i]%2==0){
                    if(st.peek()>=arr[i]){
                        st.push(arr[i]);
                    }else{
                        while(arr[i]>st.peek()){
                            newArr[j]=st.pop();
                            j++;
                        }
                        st.push(arr[i]);
                    } 
                }
            }
            i++;
        }
        while(!st.isEmpty()){
            newArr[j]=st.pop();
            j++;
        }
        i=0;
        while(i<arr.length){
            if(st.isEmpty()){
                if(arr[i]%2!=0){
                    st.push(arr[i]);
                }
            }
            else{
                if(arr[i]%2!=0){
                    if(st.peek()>=arr[i]){
                        st.push(arr[i]);
                    }else{
                        while(arr[i]>st.peek()){
                            newArr[j]=st.pop();
                            j++;
                        }
                        st.push(arr[i]);
                    }
                    
                }
            }
            i++;
        }
        while(!st.isEmpty()){
            newArr[j]=st.pop();
            j++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr={4,10,2,15};
        int[] newArr=sort(arr);
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
