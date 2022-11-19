package Interview.zoho;

public class Boolean_Matrix {
    /*
    Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it
such that if a matrix cell matrix[i] [j] is 1 then all the cells in its i'* row and j'" column
will become 1.
*/


    public static void main(String[] args) {
        int a[][]={{1,0,0,0},{0,0,0,0}};
        booMat(a,2,4);
    }
    public static void booMat(int a[][],int m,int n){
        int b[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                if(a[i][j] == 1){
                    int k1 = i;
                    int k2 = j;
                    while(k1<m){
                        b[k1][j] =1;
                        k1++;
                    }
                    while(k2<n){
                        b[i][k2] =1;
                        k2++;
                    }
                }
                else if(b[i][j]==0){
                    b[i][j] =0;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                    System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
