package Sem3;

public class Without_new {
    static String name ="Nathamuni";

    public static void method(){
        System.out.println("inside method");
    }
// Here I create a class(Without_new) ,by using Class(Inbuilt_class)
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Sem3.Without_new"); // inside ""[relative package With file name]

//forName (Static M) in Class will throw ClassNotFoundException
            Without_new obj = (Without_new) cls.newInstance();
//                              ^ TypeCasting
//newInstance will throw InstantiationException IllegalAccessException
//So i included try catch block
            obj.method();
            System.out.println(obj.name);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
 }
