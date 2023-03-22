package Interview.DynamicProg;

public class PalindromicSubSeq {
        static  String s1 ="acsdds",s2="acdds";
        public static void main(String[] args) {
            System.out.println(f(s1.length()-1,s2.length()-1));


            for(int i =0 ; i<s1.length()-1;i++) {
                for (int j = 0; j < s2.length() - 1; j++)
                    System.out.print(dp[i][j]);
                System.out.println();
            }
            System.out.println(ss);
        }

        static int dp[][] = new int[s1.length()][s2.length()];
        static String s = "",ss="";
        private static int f(int i1, int i2) {
            int flag=0;
            if(i1<0 || i2<0)
                return 0;
            //  as it returns the value on recursive call for before itself using dp , so it will not work without dp arr
            if(dp[i1][i2] != 0 )return dp[i1][i2];
            if(s1.charAt(i1)==s2.charAt(i2)){
                s = s1.charAt(i1)+s;
                if(s.length()>1 && (i1 == 0 || i2 == 0)) {
                    for (int c = 0; c < s.toCharArray().length; c++) {
                        if (s.charAt(c) != s.charAt(s.length() - c - 1))
                            flag = 1;
                    }
                    if (flag == 0 && s.length() > ss.length())
                        ss = s;
                }
                return dp[i1][i2]= 1 + f(i1-1,i2-1);

            }

            return  dp[i1][i2]=Math.max(f(i1-1,i2), f(i1,i2-1));
        }

}
