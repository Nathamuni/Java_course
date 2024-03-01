package Interview.tenkasiZoho.Round2;

public class FindPaliOrNot {
    //without using String and array
    public static void main(String[] args) {
        int a=1231,a1=a;
        int c=0;

        //length find
        while(a1!=0){
            c++;
            a1 /= 10;
        }


        c--;

        while(a!=0){
//            System.out.println((int)Math.pow(10,c));
            if(a%10 == a / (int)Math.pow(10,c))
            {
                a= a % (int)Math.pow(10,c);
                c-=2;
                a /= 10;
            }
            else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
