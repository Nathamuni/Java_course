// Count the occurrence of character in the given string without using LOOP
package Interview.Occurence_of_a_char;

import java.util.Scanner;

public class Without_Itrating {
    /*Rules to follow
    * Change into uniform formate
    * Find the actual length of  input
    * Replace the char with empty string ""
    * Now subtract the actual length and Subtracted length*/

    public static void main(String[] args) {
        String str = "NathAmuni is an amazing boy..!";
        str = str.toLowerCase();
        System.out.print("Enter the character to search : ");
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        String toSearch = Character.toString(c).toLowerCase();//Since to use replace we need String
       String replaced = str.replaceAll(toSearch,"");
        System.out.println("The total occurrence of "+c+" is "+(str.length()-replaced.length()));
    }
}
