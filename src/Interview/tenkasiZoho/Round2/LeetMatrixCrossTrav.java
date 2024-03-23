package Interview.tenkasiZoho.Round2;

public class LeetMatrixCrossTrav {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        print(matrix,matrix.length);
    }
    static void print (int a[][],int n) {
        int n2 = 2 * n -1 ;
        int i = 0, j = 0,x=0;
        while (x <= n2) {
            if(i<n){
                j=x-1;
                i=0;
            }
            else{
                i=x-n;
                j=n-1;
            }

            while((i>=0 && j <= Math.min(n-1,x)) && (j>=0 && i <= Math.min(n-1,x))){
                if(x%2==0)
                    System.out.print(a[j][i] +" ");
                else
                    System.out.print(a[i][j] +" ");

                i++;j--;

            }
            x++;
        }
    }
}
