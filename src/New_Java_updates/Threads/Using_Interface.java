package New_Java_updates.Threads;

class hi1 implements Runnable{ // inbuilt Functional interface{With method declaration run()}
    public  void run(){
        for(int i=0 ;i<5;i++){
            System.out.println("hi");
            try{ Thread.sleep(1000);} catch (InterruptedException e){}
        }
    }
}
class hello1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
        }
    }
}
public class Using_Interface {
    public static void main(String[] args) {
    hi1 obj1 = new hi1();
    Runnable obj2 = new hello1(); // Also use the method reference as interface

//        obj1.run();
//        obj2.run();   it will execute both the class one after the other in a single thread

//we can't use start directly. To use we have to create Thread obj and pass this reference
    Thread th1 = new Thread(obj1,"Hi Thread");
    Thread th2 = new Thread(obj2,"Hello Thread"); // giving name to the thread

    th1.start();
    try{ Thread.sleep(10);} catch (Exception e){} // to instruct the Scheduler to process th1 first then th2
    th2.start();
    }
}
