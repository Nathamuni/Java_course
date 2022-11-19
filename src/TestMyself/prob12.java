package TestMyself;

public class prob12 {
    public static void main(String[] args) {
        byte i = 10;
        byte j = 10;
     //   byte k = i+j; //In default during computation internal TypeCast will be done on Higher to Lower datatypes
        // Since i+j is _20 =>int(2B) where as byte is one we would get CompileTime error..!
        // to make it work..[byte k = (byte) (i+j)] External T.C.
       // System.out.println(k);
    }
}
