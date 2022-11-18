package Interview.zoho;

import java.util.ArrayList;
import java.util.HashSet;

public class StringReverselWitoutRepeatingChar {
    static String s = "GEEKS FOR GEEKS  ";

    public static void main(String[] args) {
        System.out.println(summa(s));
     }

    static ArrayList<Character> arr = new ArrayList();

    public static String summa(String s) {
        char[] c = s.toCharArray();
        String out ="";
        for (int i = c.length - 1; i >= 0; i--) {
            if (!arr.contains(c[i]) && c[i]!=' ')
                  arr.add(c[i]);
        }// adding in reverse because the values on reverse should retain and repeating character then nullified
        for (int i = 0;i < arr.size() ; i++) {
            out+=Character.toString(arr.get(i));
        }
        return out;
    }
}
