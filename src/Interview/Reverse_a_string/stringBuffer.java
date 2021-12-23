package Interview.Reverse_a_string;

public class stringBuffer {
    public static void main(String[] args) {
        String given = "Nathamuni";
        StringBuffer str = new StringBuffer(given);
// or we can also copy using str.append(given);
        System.out.println(str.reverse());
    }
//Since we don't have reverse() in String we can use stringBuffer or Builder
}
