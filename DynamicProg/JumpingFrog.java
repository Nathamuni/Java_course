package Interview.DynamicProg;

public class JumpingFrog {
    public static void main(String[] args) {
        int n = 6;
         int[] arr = {30,10,60,10,60,50};
        //int[] arr = {10,20,30,10};
        System.out.println(minCost(arr, n-1));
    }
    static int sum =0;
    private static int minCost(int[] arr, int n) {
// Working recursive model
//        if(n==1) {
//             sum+=arr[n-1];
//            return  sum;
//        }
//        else if(n==2) {
//            sum+=arr[n-2];
//            return  sum;
//        }
//        int a ,b;
//        a= Math.abs(arr[n]-arr[n-1]);
//        b= Math.abs(arr[n]-arr[n-2]);
//        if(a>b){
//            sum+=b;
//            minCost(arr,n-2);
//        }
//        else{
//            sum+=a;
//            minCost(arr,n-1);
//        }
//        return sum;

//  ===============Tabulation BOTTOM-UP ==================
        int[] dp = new int[n+1];
        dp[0]=0;
        for(int i =1; i<= n ; i++){
            int fs = dp[i-1] + Math.abs(arr[i]- arr[i-1]);
            int ss = Integer.MAX_VALUE;

            if(i>1)
                ss= dp[i-2] + Math.abs(arr[i]- arr[i-2]);

            dp[i] = Math.min(fs,ss);
        }
        return dp[n];
    }
}
