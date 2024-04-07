interface Bicycle {
    int a=20;
    void brake(int decrement);
}
class Avon implements Bicycle{
    public void brake(int decrement){
        a=a-decrement;
    }
}
public class Java { 
    public static void main(String[] args){
        
    }
}
