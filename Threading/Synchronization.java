public class Synchronization {
    public static void main(String[] args) {
        thread obj=new thread();
        thread.Ab obj1 = obj.new Ab();
        thread.B obj2 = obj.new B();
        thread.C obj3 = obj.new C();
        obj1.start();
        obj2.start();
        obj3.start();
    }
}

class thread {
    public int count = 0;
    public synchronized void increment(){
        count++;
        System.out.println(count);

    }
    class Ab extends Thread {
        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                increment();
            }
        }
    }
    class B extends Thread {
        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                // System.out.println("Thread2 is running");
                increment();
            }
        }
    }

    class C extends Thread {
        @Override
        public void run() {
            for (int i = 1; i < 3; i++) {
                increment();
            }
        }
    }
}