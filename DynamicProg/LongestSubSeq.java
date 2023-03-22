package Interview.DynamicProg;

public class LongestSubSeq {
   static  String s1 ="aertbaaaaaa6666c",s2="bcdewraaat";
    public static void main(String[] args) {
        System.out.println(f1(s1.length()-1,s2.length()-1));
    }

    private static int f1  (int i1, int i2) {
        if(i1<0 || i2<0)
            return 0;
        if(s1.charAt(i1)==s2.charAt(i2))
            return 1 + f(i1-1,i2-1);

        return 0 +Math.max(f(i1-1,i2), f(i1,i2-1));
    }
    private static int f(int i1, int i2) {
        int dp[][] = new int[i1+1][i2+1];
        if(i1<0 || i2<0)
            return 0;
        if(dp[i1][i2] != 0 )return dp[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2))
            return dp[i1][i2]= 1 + f(i1-1,i2-1);

        return  dp[i1][i2]=Math.max(f(i1-1,i2), f(i1,i2-1));
    }
}
