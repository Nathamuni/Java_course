package Interview.DynamicProg;

public class ShortestCommonSuperSeq {
    public static void main(String[] args) {

        System.out.println(SCSS(s1.length()-1,s1.length()-1,s1,s2));

            int i=s1.length(), j=s2.length();
            String s="";
            while(i>0 && j>0){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    s = s1.charAt(i-1)+s;
                    i--;j--;
                }
                //dp size s1.length+1  s2.length+1
                else if(dp[i-1][j] > dp[i][j-1]){
                    s = s1.charAt(i-1)+s;
                    i--;
                }
                else{
                    s = s2.charAt(j-1)+s;
                    j--;
                }
            }
            //either s1 will have some a char or s2
        // but s1.len or s2,len will come to 0
            while(i>0){
                s = s1.charAt(i-1)+s;
                i--;
            }while(j>0){
                s = s2.charAt(j-1)+s;
                j--;
            }
        System.out.println(s);
    }
    static String s1="brute";
    static String s2="groot";

//    private static String SCSS(int i1,int i2,String s1,String s2){
//        if(i1<0 || i2<0) return "";
//        if(s1.charAt(i1)==s2.charAt(i2)){
//            return SCSS(i1-1,i2-1,s1,s2) + s1.charAt(i1);
//        }
//        return SCSS(i1-1,i2-1,s1,s2) + s1.charAt(i1)+ s2.charAt(i2);
//    }

    static int dp[][] = new int[s1.length()+1][s2.length()+1];
    private static int SCSS(int i1,int i2,String s1,String s2){

        if(i1<0 || i2<0)
            return 0;
        if(dp[i1][i2] != 0 )return dp[i1][i2];
        if(s1.charAt(i1)==s2.charAt(i2))
            return dp[i1+1][i2+1]= 1 + SCSS(i1-1,i2-1,s1,s2);

        return  dp[i1+1][i2+1]=Math.max(SCSS(i1-1,i2,s1,s2), SCSS(i1,i2-1,s1,s2));
    }
}
