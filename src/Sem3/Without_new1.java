package Sem3;

public class Without_new1 implements Cloneable{
    public Object clone() throws CloneNotSupportedException{ //it throws CloneNot... excp
        return super.clone();// super here is to return the clone for parent class
    }// Clone class is a functional interface(contains only one method(clone)) which returns an obj
    static String name ="Nathamuni";

    public static void method(){
        System.out.println("inside method");
    }

    public static void main(String[] args)
    {
        Without_new1 obj1 = new Without_new1(); // creating one obj of this cls

        try {
            Without_new1 obj2 = (Without_new1)obj1.clone(); // create a clone of first obj1 and copies to obj2
            System.out.println(obj2.name);
            obj2.method();
        }
        catch (Exception e) {}
    }
}
