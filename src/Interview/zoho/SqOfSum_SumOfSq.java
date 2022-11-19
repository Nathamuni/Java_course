package Interview.zoho;
public class SqOfSum_SumOfSq {
    static int sum = 0;
    static int val =0;
    //ans =(a1+a2+a3....)**2 - a1**2 + a2**2 + a3**2 ....
    public static void main(String[] args) {
        int n = 10;

      System.out.println(sqOfSum(n) -sumOfSq(n));
    }

    public static int sumOfSq(int n) {

        if(n>0){
            sum += n*n;
            sumOfSq(n-1);
        }
        return sum;
    }

    private static int sqOfSum(int n) {
        if(n>0) {
            val += n;
            sqOfSum(n - 1);
        }
        return val*val;
    }
}
