package Interview;

public class Vowels_counter {
    public static void main(String[] args) {
        String str = "This is a sample string";
        String newstr = str.replaceAll("[AEIOUaeiou]","");
        System.out.println("Total number of vowels here : "+(str.length() - newstr.length()));
    }
}
