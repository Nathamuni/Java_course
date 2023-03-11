package Interview.DynamicProg;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int [] w ={2,4,6};
        int [] val ={5,11,13};
        System.out.println(knap_suck(2,10,w,val));
    }

    private static int knap_suck(int i,int W,int []w,int[] val) {
        if(i==0){
                return W/w[0] * val[0];
        }
        int nottake = 0 + knap_suck(i-1,W,w,val);
        int take = 0;
        if(w[i] <= W)
            take = val[i]+knap_suck(i,W-w[i],w,val);

        return Math.max(take,nottake);
    }
}
