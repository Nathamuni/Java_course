package TestMyself;

public final class prob8 {
    public static String name = "Nathamuni";

    public static void main(String[] args) {

        final class constantdata {
        public void print() {
            System.out.println(name);
            }
        }
        constantdata cd =new constantdata();
        cd.print();
    }
}
