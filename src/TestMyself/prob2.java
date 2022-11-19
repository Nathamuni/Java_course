package TestMyself;

class X {
   public X() {
        System.out.println("X");
    }
}

class Y extends X {
  public Y() {
        System.out.println("Y");
    }
}

class Z extends Y {
    public Z() {
        System.out.println("Z");
    }

}
public class prob2 {
    public static void main(String[] args) {
        Z z = new Z();
    }
}

