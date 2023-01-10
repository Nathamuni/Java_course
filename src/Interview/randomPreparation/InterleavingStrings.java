package Interview.randomPreparation;
//leetcode : https://leetcode.com/problems/interleaving-string/
//to find third string can be built with s1 and s2 (same order)
public class InterleavingStrings {
    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        int i,j,k=i=j=0;
        int flag =0,summa1=0,summa2=0;
        while(i < s1.length() || j < s2.length()){
            if(s1.charAt(i) == s3.charAt(k) && s2.charAt(j) == s3.charAt(k)){
                flag =1;
                i++;j++;
            }
            else if(s1.charAt(i) == s3.charAt(k)) {
                summa1 = i;
                if(flag ==1) j=summa2;
                i++;k++;
            }
           else if(s2.charAt(j) == s3.charAt(k)) {
                summa2 = j;
                if(flag ==1) i=summa1;
                j++;k++;
            }
           else return false;
        }
        return true;
    }
}
