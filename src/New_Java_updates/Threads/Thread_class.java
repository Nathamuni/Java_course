package New_Java_updates.Threads;

class hi extends Thread{
    public  void run(){
        for(int i=0 ;i<5;i++){
            System.out.println("hi");
            try{ Thread.sleep(1000);} catch (InterruptedException e){}
// Thread.sleep() method throws InterruptedException if a thread in sleep is interrupted by other threads.
// InterruptedException is a checked type of exception. That means, “Thread.sleep()” statement must be enclosed within try-catch blocks
        }
    }
}
class hello extends Thread { // inbuilt class Thread
    public void run() {  // run() is a method in Thread class(here overriding)
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}

        }
    }
}
public class Thread_class {
    public static void main(String[] args) {
        hi obj1 = new hi();
        hello obj2 = new hello();

//        obj1.run();
//        obj2.run();   it will execute both the class one after the other in a single thread

        obj1.start(); // to use a thread we have to start a thread
        try{ Thread.sleep(10);} catch (Exception e){} // only one thread can run at a time to avoid clash we add 10 mil
        obj2.start();// whenever we extend thread that obj is also a thread
    }
}
