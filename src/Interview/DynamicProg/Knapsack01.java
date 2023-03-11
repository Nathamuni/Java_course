package Interview.DynamicProg;

public class Knapsack01 {
    static int a[][] =
                    {{30,3},
                    {40,2},
                    {60,4} };
    public static void main(String[] args) {

        System.out.println(f(2,5));
    }

    private static int f(int n, int w) {

        if(n<0) return 0;
        int nottake =0 + f(n-1,w);
        int take = Integer.MIN_VALUE;
        if(w>=a[n][1]){
            take = a[n][0] + f(n-1,w-a[n][1]);

        }
        return Math.max(take,nottake);
    }
}
