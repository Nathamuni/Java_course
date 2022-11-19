// Convert the given string to lowercase with ur own logic
package Interview;

public class ChangeIntoLowerCase {
    public static void main(String[] args) {
        String s = "HeLlO GuyS,tHIs is NATHamuni";
        char [] c = s.toCharArray();
        for (char ch : c) {
            if (ch >= 65 && ch <= 90){
                ch += 32;
            }

            System.out.print(ch);
        }

    }
}
