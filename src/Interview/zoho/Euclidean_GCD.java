package Interview.zoho;
//Given two positive integers A and B, find GCD of A and B.
public class Euclidean_GCD {
    public static void main(String[] args) {
       System.out.println( gcd(39,21));
    }
    public static int gcd(int a,int b){
        int rem;
        int temp=0;
        if(a<b) {
            temp = a;
            a=b;
            b=temp;
        }
        rem = b;// rem should not be zero ,we assign min value
        //even if it takes only one iteration (loop terminate) so as to return the minimum value
        while(rem!=0) {
           temp = rem;
            rem = a % b;

            a = b;
            b = rem;
        }
        return temp;
    }
}
