package Sem3;

class C  {
    public void show(){
        System.out.println("show3");
    }
    int a = 13;
    int b = 33;
    int m;
    C(){
        int d = 34;
        int e;
        System.out.println("C constructor");

    }

}

public class constructorRef {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a);
        System.out.println(c.b);
//        System.out.println(c.d);
//        System.out.println(c.e);
        System.out.println(c.m);






    }


}
