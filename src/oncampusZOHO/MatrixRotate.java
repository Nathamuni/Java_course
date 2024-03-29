package oncampusZOHO;

import java.util.Arrays;

public class MatrixRotate {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int b[][] = {{9,8,7},{6,5,4},{3,2,1}};
        int k=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=k++;
            }
        }


        System.out.println(Arrays.deepToString(right90(a)));
    }

    private static int[][] right180(int[][] matrix) {
        int[][] a = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
//checks if i is not equal to j because in transpose matrix diagonal elements will not swap
        a[i][j]= matrix[j][2-i];


            }
        }
        return a;
    }

    private static int[][] right90(int[][] matrix) {
        int[][] a = new int[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
//checks if i is not equal to j because in transpose matrix diagonal elements will not swap
                a[i][j] =  matrix[2-j][i];


            }
        }
        return a;
    }

}
