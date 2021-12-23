// Change the vowels of a string to the given character

package Interview;

public class EliminateVowels {
    public static void main(String[] args) {
        String s = "I love you !!!";
        char [] c = s.toCharArray();
        for (char ch:c) {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.print("_");
            else System.out.print(ch);
        }
        System.out.println();
//        -------------------Or else simply----------------------
       String replace = s.replaceAll("[AEIOUaeiou]","\\$"); // escapeSequence \\$
        System.out.print(replace);  // HERE WE CAN'T USE $ SYMBOL DIRECTLY
//        Since it represents end of the string(endsWith) so to use $ we must use \\$
    }
}
