public class Threads_methods {
    public static void main(String[] args){
        Threads2 obj1=new Threads2();
        B obj2 =new B();
        C obj3=new C();
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(5);
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
//sleep using try catch
class Threads2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<5;i++){
                // try {
                //     sleep(10000);
                // } catch (Exception e) {
                //     System.out.println(e);
                // }
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
//set priority 
class C extends Thread{
    @Override
    public void run(){
        for(int i=1;i<5;i++){
            // if(i==1) yield();
            System.out.println("Thread3 is running");
        }
    }
}