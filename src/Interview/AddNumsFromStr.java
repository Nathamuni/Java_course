// Find the numbers from the string and find their sum of those numbers
package Interview;

public class AddNumsFromStr {
    public static void main(String[] args) {
        String s = "This 4is an 6examp0le of23 String1"; // 4+6+0+2+3+1 = 16
        char[] c = s.toCharArray();
        int add = 0;
        for (char ch:c) {
            int i = ch;         //we can also use
            if(i>47 && i<58){   //Character.isDigit(ch);
                i = i-48;       //add = add + Character.getNumericValue(ch);
                add += i;
            }
        }
        System.out.println(add);
    }
}
