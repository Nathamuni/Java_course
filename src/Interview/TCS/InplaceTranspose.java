package Interview.TCS;

import java.util.Arrays;

public class InplaceTranspose {
    public static void main(String[] args) {
        int N = 2;
       int mat[][] = {{1, 1, 1, 1},
               {2, 2, 2, 2},
               {3, 3, 3, 3},
               {4, 4, 4, 4}};

       transpose(mat,N);
    }
    static void transpose(int m[][], int n)
    {
       int i=0,j=0,a=0;
        for(i=j;i<n; i++)
            for(j=0;j<i; j++){

                 a =m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = a;
            }
        for(i=0;i<n; i++) {
            System.out.println();
            for(j=0;j<n; j++) System.out.print(m[i][j]+" ");
        }

    }
}
