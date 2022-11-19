package New_Java_updates.Threads;

public class Join_isAlive {
    public static void main(String[] args) throws InterruptedException {
//  Throws is used to handle that exception[here InterruptedException] which is thrown by that method[main]
//  Whereas Throw is used to throw excep.. explicitly within a method or a block..!
        Runnable  r3 = () ->
        {
            for(int i=0 ;i<5;i++){
                System.out.println("hi");
                try{ Thread.sleep(1000);} catch (InterruptedException e){}
            }
        };

        Runnable  r4 = () ->
        {
            for(int i=0 ;i<5;i++){
                System.out.println("hello");
                try{ Thread.sleep(1000);} catch (InterruptedException e){}
            }
        };

        Thread th3 = new Thread(r3);
        Thread th4 = new Thread(r4);

        th3.start();
        try{ Thread.sleep(10);} catch (Exception e){} // to instruct the Scheduler to process th1 first then th2
        th4.start();

        System.out.println("Check if the thread th3 is on : "+th3.isAlive());
        System.out.println("Check if the thread th4 is on : "+th4.isAlive());


 //       System.out.println("Bye");
// since only Thread th3 & th4 are working and main thread is free it will execute the sout in advance
//   So we can wait for the threads to JOIN and finally execute the "Bye"

        th3.join();// will through exception
        th4.join();
//     "Let th3 & th4 join"
        System.out.println("Bye");

//   We can also set priority [th3.setPriority(4);]
//   in which the Scheduler will decide the priory of execution of th thread(Default:5)

        System.out.println("Check if the thread th3 is on : "+th3.isAlive());
        System.out.println("Check if the thread th4 is on : "+th4.isAlive());
    }
}
