package Interview.tenkasiZoho.Round2;

public class EuclidianAlgo {
    public static void main(String[] args) {
        int a=108,b=20;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        int reminder = a%b;
        int quotient = a / b;
        if(reminder == 0) return b;
        while(reminder != 0) {
            quotient = a / b;
            reminder = a % b;
            a = b;

            b = reminder;
        }
        return a;
    }
}
