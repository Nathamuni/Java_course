package Interview.DynamicProg;
//similar prob is climbing steers ,to calculate all possible ways of climbing 1 & 2 steps
//https://www.codingninjas.com/codestudio/problems/count-ways-to-reach-nth-stairs_798650?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==0)
            return 1;// as we count ways of doing so
        if(n==1)
            return 1;

        return fib(n-1) + fib(n-2);

    }
}
