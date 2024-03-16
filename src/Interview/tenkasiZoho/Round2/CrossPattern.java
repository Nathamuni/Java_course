package Interview.tenkasiZoho.Round2;

public class CrossPattern {

    public static void main(String[] args) {
        int n= 7;
        n= (n-1)*2;

        for(int i=0; i<=n; i++){
            for(int j = 0 ; j<=n ;j++){
                if(i==0 || i== n)
                {
                 j++;
                 System.out.print("* ");
                }
                else if(j==i || j==n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
