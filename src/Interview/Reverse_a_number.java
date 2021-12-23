// Reverse a number
 package Interview;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        long num;
        long reverse=0;
        System.out.println("Enter a number to reverse : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
//        Logic
        while(num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.println("After reversing "+reverse);
    }
}
