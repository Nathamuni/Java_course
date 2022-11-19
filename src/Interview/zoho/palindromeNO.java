package Interview.zoho;

public class palindromeNO {

    public static void main(String[] args) {
        int num =10010;
        int dup = num;
        int reverse=0;

        while(num>0){
            reverse = (reverse * 10) + num%10;
            num /= 10;
        }
        if(reverse == dup) System.out.println(true);
        else System.out.println(false);
    }
}
