package New_Java_updates;

interface X{  // Done only with an interface with only one unimplemented method(functional interface)
     void show();
}
public class Lambda {
    public static void main(String[] args) {
        X obj = new X(){      // whatever methods we want to implement(ONCE) can be specified
            public void show(){
                System.out.println("hello 1");
            }
        };
        obj.show();
//  -------------------------------------------------------
        X obj1 = () ->  //here () is used to specify if there are parameters
        {
            System.out.println("Hello 2");
        };
//   since obj1(object) is referring to X(interface)
//   we can directly create anonymous class and specify the execution part
//   Mainly a method needs method name,parameter,return types
//   As it is specified inside the interface X it is unnecessary .
        obj1.show();
//  ---------------------------------------------------------
        X obj2 = () -> System.out.println("hello 3");   // as it is one line so no need for {};
        obj2.show();

    }
}
