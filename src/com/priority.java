package com;

public class priority {
    public static void main(String[] args) throws InterruptedException {
//  Throws is used to handle that exception[here InterruptedException] which is thrown by that method[main]
//  Whereas Throw is used to throw excep.. explicitly within a method or a block..!
        Runnable  r3 = () ->
        {
            for(int i=0 ;i<5;i++){
                System.out.println("hi "+Thread.currentThread().getPriority());

            }
        };

        Runnable  r4 = () ->
        {
            for(int i=0 ;i<5;i++){
                System.out.println("hello "+Thread.currentThread().getPriority());
            }
        };

        Thread th3 = new Thread(r3);
        Thread th4 = new Thread(r4);

        th3.setPriority(Thread.MAX_PRIORITY);
        th4.setPriority(Thread.MIN_PRIORITY);
//   in which the Scheduler will decide the priory of execution of th thread(Default:5)

        th3.start();
        try{ Thread.sleep(10);} catch (Exception e){}
        th4.start();

        th3.join();// will through exception
        th4.join();
//     "Let th3 & th4 join"
        System.out.println("Bye");

        System.out.println("Check if the thread th3 is on : "+th3.isAlive());
        System.out.println("Check if the thread th4 is on : "+th4.isAlive());
    }
}
