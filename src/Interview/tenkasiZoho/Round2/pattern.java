package Interview.tenkasiZoho.Round2;

public class pattern {
    public static void main(String[] args) {
        int k0=2,k1=1;
        int n=5;
        int space = n-1;
        for(int i=0;i<n; i++){
            int temp = space;
            //==========space=============
            while(temp>0){
                System.out.print("   ");
                temp--;
            }
            space-=1;
            //============================
            for(int j=i; j>=0 ; j--){

                if(i%2==0){
                    System.out.print(k1+" ");
                    k1+=2;
                }
                else{
                    System.out.print(k0+" ");
                    k0+=2;
                }
            }
            System.out.println();
        }
    }
}
