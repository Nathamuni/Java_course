package Interview.zoho;

public class PrimeFactor235 {
    public static boolean two(int n){
        if(n%2==0)
            return true;
        else return false;
    }
    public static boolean three(int n){
        if(n%3==0)
            return true;
        else return false;
    }
    public static boolean five(int n){
        if(n%5==0)
            return true;
        else return false;
    }

    public static void main(String[] args) {

       // int flag=0;
        int n = 10;
        int x=n;
if (n==1){ System.out.println(false); System.exit(1);}
        while(three(n)){
        //    flag+=1;
            n= n/3;
            x=n;
        }
        while(five(x)){
            n= n/5;
            x=n;
        }

        while(two(x)){
            n= n/2;
            x=n;
        }

if(x==1) System.out.println(true);
else System.out.println(false);
    }
}
