package Interview.DynamicProg;

public class MinimumCoin {
    public static void main(String[] args) {

        System.out.println(mincoin1(3,11));
    }
//{9,6,5,1};
static int [] a={9,6,5,1};
    private static int mincoin(int i, int t) {
        if(i==0){
            if(t%a[i]==0)
                return t/a[i];
            return 999999;
        }
        int nottake = 0 + mincoin(i-1,t);
        int take = 999999;
        if(a[i] <= t)
            take = 1+mincoin(i,t-a[i]);

        return Math.min(take,nottake);
    }
// Memoization.............
    private static int mincoin1(int i, int t) {
         int[] [] dp = new int[i+1][t+1];
        if(i==0){
            if(t%a[i]==0)
                return t/a[i];
            return 999999;
        }
        if(dp[i][t]!=0) return dp[i][t];
        int nottake = 0 + mincoin(i-1,t);
        int take = 999999;
        if(a[i] <= t)
            take = 1+mincoin(i,t-a[i]);

        return dp[i][t]=Math.min(take,nottake);
    }


}
