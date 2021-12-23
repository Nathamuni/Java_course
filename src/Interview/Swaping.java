//Swapping without using 3rd variable
package Interview;
import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two integers\n");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping\na="+a+"\tb="+b);
    }
}
