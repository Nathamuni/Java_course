package Interview.randomPreparation;
//leetcode : https://leetcode.com/problems/interleaving-string/
//to find third string can be built with s1 and s2 (same order)
public class InterleavingStrings {
    public static void main(String[] args) {
        System.out.println(isInterleave("aabc","dbbca","aadbbcbcac"));
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        int i,j,k=i=j=0;
        int flag =0,summa1=0,summa2=0;
        while(i < s1.length() || j < s2.length()){
            if(i<s1.length() && s1.charAt(i) == s3.charAt(k) && j<s2.length() && s2.charAt(j) == s3.charAt(k)){
                flag =1;
                i++;j++;k++;
            }
            else if(i<s1.length() && s1.charAt(i) == s3.charAt(k)) {

                if(flag ==1) {
                    j=summa2;
                    flag=0;
                }
                i++;k++;
                summa1 = i;
            }
           else if(j<s2.length() && s2.charAt(j) == s3.charAt(k)) {

                if(flag ==1) {
                    i=summa1;
                    flag=0;
                }
                j++;k++;
                summa2 = j;
            }
           else return false;
        }
        return s1.length() + s2.length() == s3.length();
    }
}
