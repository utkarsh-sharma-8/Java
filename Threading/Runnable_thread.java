public class Runnable_thread {
    public static void main(String[] args){
        X runnable =new X();
        Thread threadX=new Thread(runnable);
        threadX.start();
    }
}
class X implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread is printing");
        }
    }
}