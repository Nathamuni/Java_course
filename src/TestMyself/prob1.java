package TestMyself;
class A {
    public void PrintData() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}

class C extends B {
    public void PrintData() {
        System.out.println("C");
    }

    private  class prob1 {
        public static void main(String[] args) {
        C c = new C();
        }
    }
}
