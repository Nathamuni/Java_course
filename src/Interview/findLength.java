//Find the length of the given string without using length() func
package Interview;

public class findLength {
    public static void main(String[] args) {
//      without using length func
        String s = "Nathamuni";
        int count =0;
        char c[] = s.toCharArray();
        for (char ch:c){
            count++;
        }
        System.out.println(count);
    }
}
