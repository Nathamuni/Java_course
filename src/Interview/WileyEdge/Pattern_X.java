package Interview.WileyEdge;

public class Pattern_X {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int i=1; i<=2*n; i++){
            for(int j=1; j<2*n;j++){

                if(i==j || i+j==2*n)
                System.out.print(" "+k+" ");

                else System.out.print("  ");
            }
            System.out.println();
            if(i>=n)--k;
            else k++;
        }
    }
}
