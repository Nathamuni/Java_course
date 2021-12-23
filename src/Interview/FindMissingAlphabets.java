// From the given string find the missing alphabets

package Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindMissingAlphabets {
    public static void main(String[] args) {
        String s = " Nathamuni ";
        s = s.toLowerCase();
        s = s.replaceAll(" ","");// to remove space
        String[] arr = s.split("");

        String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
        HashSet<String> set1 = new HashSet<String>(List.of(arr)); //adds everything from arr to set1
        /*          Or
        * HashSet<String> set1 = new HashSet<>();
        * for(String str: arr){
        *   set1.add(str);
        * }   */
        HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabets));
        set2.removeAll(set1);
        System.out.println(set2);

    }
}
