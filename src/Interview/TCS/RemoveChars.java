package Interview.TCS;

public class RemoveChars {
    //https://practice.geeksforgeeks.org/problems/remove-character3815/0
    public static void main(String[] args) {
//        str1 contains string value str2 contains inoru string value
//        to remove str2 values in str1
        String str1="nathamuni";
        String str2 = "na";
        System.out.println(remove(str1, str2));
    }

    private static String remove(String str1, String str2) {
        int[] val = new int[26];
        for(int i = 0; i< str2.length();i++){
            val[str2.charAt(i)-97] = 1;
        }
        String out="";
        for(int i = 0; i< str1.length();i++){
            if(val[str1.charAt(i)-97] ==0) out+=str1.charAt(i);
        }
        return out;
    }
}
