package New_Java_updates;
// Can be used with both class and interface but not simultaneously
class A{
    public void show(){
        System.out.println("hi");
    }
}
// if i want to override the show method
// instead of creating a new class to override we can make changes while creating object
public class Anonymous {
//    The main use of Anonymous class is when we want to create a class and use it only once
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){ // Overriding on creating object
                System.out.println("hello");
            }
        };
        obj.show(); // this will execute the overrided method
    }
// can be used for implementing on runtime also
}
