package Interview.TCS;

public class PrimeNo {
    //check for prime number in √n time
    public static void main(String[] args) {
        int a = 31;
        int flag =0;
        int sq = (int)Math.sqrt(a);
        for(int i=2; i<=sq;i++){
            if(a%i==0){
                System.out.println("Composite");
                flag =1;
            }
        }
        if(flag ==0) System.out.println("Prime");
    }
}
