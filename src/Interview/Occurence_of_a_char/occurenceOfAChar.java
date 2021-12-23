// Count the occurrence of character in the given string

package Interview.Occurence_of_a_char;

import java.util.Scanner;

public class occurenceOfAChar {
    public static void main(String[] args) {
        int count = 0;
        String str = "NathAmuni is an amazing boy..!";
        str = str.toLowerCase();
        System.out.print("Enter the character to search : ");
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        for(int i=0 ; i<str.length() ; i++)
            if(str.charAt(i) == c || str.charAt(i) == c+32)
                count++;
        System.out.println(count);
    }
}
