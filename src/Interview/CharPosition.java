// Find the position of character in alphabetical order
package Interview;

import java.util.Scanner;

public class CharPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        char Char = s.next().charAt(0);
        int i = Character.toLowerCase(Char);
        i = i-96;
        System.out.println("The character is "+ i +" in alphabetical order");
    }
}
