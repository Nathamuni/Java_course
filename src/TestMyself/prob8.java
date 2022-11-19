package TestMyself;

public final class prob8 {
    public static String name = "Nathamuni";// Static keyword should't b inside any method

    public static void main(String[] args) {

        final class constantdata {
        public void print() {
            System.out.println(name);
            }
        }
//      final class will prevent inheritance and can't be extended
        constantdata cd =new constantdata();
        cd.print();
    }
}
