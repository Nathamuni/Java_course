package New_Java_updates.Threads;

class counter{
    int count;
    public synchronized void increment(){
        count++;
    } // Now it is thread-safe
}

public class Syncronize {
    public static void main(String[] args) throws Exception {
        counter c = new counter();

        Thread th5 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        };

        Thread th6 = new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        };

        th5.start();
        th6.start();
        th5.join();
        th6.join();

        System.out.println("Value inside count "+c.count);
    }
}
