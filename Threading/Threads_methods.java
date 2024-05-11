public class Threads_methods {
    public static void main(String[] args){
        Threads2 obj1=new Threads2();
        obj1.start();
        B obj2 =new B();
        obj2.start();
    }
}
class Threads2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<5;i++){
                try {
                    sleep(10000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            System.out.println("Thread1 is running");
        }
    }
}
class B extends Thread{
    @Override
    public void run(){
        for(int i=1;i<5;i++){
            // if(i==1) yield();
            System.out.println("Thread2 is running");
        }
    }
}