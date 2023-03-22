package Interview.DynamicProg;

public class RodCutting {
//    given rod length & an array of cast to find what are the divisions to cut to get max profit
    public static void main(String[] args) {
        int N =5;
        int [] price = {2, 5, 7, 8, 10};
        System.out.println(maxProfit(N-1,price,N-1));
    }

    private static int maxProfit(int n, int[] price,int N) {
        if(n==0)
            return N*price[0];
        if(N<=0) return 0;
        int notconsider = 0 + maxProfit(n-1,price,N);
        int consider= Integer.MIN_VALUE;
        if(N>=n){
            consider =price[n]+ maxProfit(n,price,N-(n+1));
        }
        return Math.max(consider,notconsider);
    }
}
