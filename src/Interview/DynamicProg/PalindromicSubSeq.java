package Interview.DynamicProg;

// class PalindromicSubSeq1 {
//        static  String s1 ="ABCBXDCXBA",s2="ACDGDCJA";
//        public static void main(String[] args) {
//            System.out.println(f(s1.length()-1,s2.length()-1));
//            System.out.println(ss);
//        }
//
//        static int dp[][] = new int[s1.length()][s2.length()];
//        static String s = "",ss="",maxstr="";
//        private static int f(int i1, int i2) {
//            int flag=0;
//            if(i1<0 || i2<0)
//                return 0;
//            //  as it returns the value on recursive call for before itself using dp , so it will not work without dp arr
//            if(dp[i1][i2] != 0 )return dp[i1][i2];
//            if(s1.charAt(i1)==s2.charAt(i2)){
//                s = s1.charAt(i1)+s;
//                ss= ss + s1.charAt(i1);
//                if(i1 == 0 && i2 == 0) {
//                    if (s.equals(ss) && maxstr.length()<s.length())
//                        maxstr= s;
//                }
//                return dp[i1][i2]= 1 + f(i1-1,i2-1);
//
//            }
//
//            return  dp[i1][i2]=Math.max(f(i1-1,i2), f(i1,i2-1));
//        }
//
//}
public class PalindromicSubSeq {

    public static void main(String[] args) {
        String str1 ="skmnkks";
        String str2 = "skkkkkss";
        String result = lps(str1, str2, str1.length(), str2.length());
        System.out.println("Longest palindromic subsequence: " + result);
    }

    public static String lps(String str1, String str2, int m, int n) {
        if (m == 0 || n == 0) {
            return "";
        }
        if (str1.charAt(m-1) == str2.charAt(n-1)) {
            return lps(str1, str2, m-1, n-1) + str1.charAt(m-1);
        }
        String lps1 = lps(str1, str2, m, n-1);
        String lps2 = lps(str1, str2, m-1, n);
        return (lps1.length() > lps2.length()) ? lps1 : lps2;
    }
}