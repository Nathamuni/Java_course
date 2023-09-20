package Interview;

public class TringlePattern {
    public static void main(String[] args) {
        int n=5;
        for(int i =1 ; i<= n ; i++){
            int j=0;
            while(j++<n-i)   System.out.print(" ");
            int k=i;
            while(k>=1) System.out.print(k--);
            k=2;
            while (k<=i) System.out.print(k++);
            System.out.println();
        }
    }
}
