package Interview.DynamicProg;

public class TotWaysOfCoinPick {
    public static void main(String[] args) {
        int ind =a.length-1;
        int target = 11;
        System.out.println(f(ind,target));
    }
// to count all possible ways with which we form the target element (can reuse a coin)
    private static int f(int ind, int target) {
        if(ind==0) {
            if(target % a[0]==0) return 1;
            return 0;
        }
        int nottake = f(ind-1,target);
        int take =0;
        if(a[ind] <= target){
            take=f(ind,target-a[ind]);
        }
        return take+nottake;
    }

    static int [] a={9,6,5,1};


}
