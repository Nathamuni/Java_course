package New_Java_updates.Threads;

public class Interface_with_Lambda
{
    public static void main(String[] args) {
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


//we can't use start directly. To use we have to create Thread obj and pass this reference
    Thread th3 = new Thread(r3);
    Thread th4 = new Thread(r4);

    th3.start();
    try{ Thread.sleep(10);} catch (Exception e){} // to instruct the Scheduler to process th3 first then th4
    th4.start();
    }

}
