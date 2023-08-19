public class Reverse_array {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int[] reverse(int num[]){
        int start=0;
        int end=num.length-1;
        while(start<end){
            swap(num,start,end);
            start++;
            end--;
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
