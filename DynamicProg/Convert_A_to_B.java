package Interview.DynamicProg;

public class Convert_A_to_B {
    public static void main(String[] args) {
        String A = "abcd";
        String B = "anc";
        int result = A.length() + B.length() - 2 * f(A.length()-1,B.length()-1,A,B);
        System.out.println(result);
    }
    private static int f(int i1, int i2,String s1,String s2) {
        int[][] dp = new int[i1+1][i2+1];
        if(i1<0 || i2<0)
            return 0;
        if(dp[i1][i2] != 0 )return dp[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2))
            return dp[i1][i2]= 1 + f(i1-1,i2-1,s1,s2);

        return  dp[i1][i2]=Math.max(f(i1-1,i2,s1,s2), f(i1,i2-1,s1,s2));
    }
}
