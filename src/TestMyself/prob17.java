package TestMyself;

public class prob17 {
    public static void main(String[] args) {
        int i=10,j;
        j = i++ + -++i + -i++;
        System.out.println("i = "+i+" j= "+j);
    }
}
