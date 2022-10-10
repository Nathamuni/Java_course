package Interview.zoho;

public class spiralMatrixPrint {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3,4}, // rows = m and column = n
                { 5, 6,7,8},
                {9, 10,11,12},
                {13,14,15,16}};
        int m, n = m = 4;
        int i =0,j=0,mincol = 0,minrow = 0,maxcol = n-1,maxrow = m-1;
while (i!=2 && j!=2){
                for (;j<maxcol;j++){
                    System.out.print(A[i][j] + " ");

                }
                for(;i<maxrow;i++) {
                    System.out.print(A[i][j]+ " ");
                }while(j != mincol){
                    System.out.print(A[i][j--]+ " ");
                }while(i > minrow){
                    System.out.print(A[i--][j]+ " ");
                }
                i++;j++; minrow+=1; maxrow-=1;
                     mincol+=1;maxcol-=1;


                     }

    }
}
