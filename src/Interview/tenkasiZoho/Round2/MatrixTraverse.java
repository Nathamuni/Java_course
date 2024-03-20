package Interview.tenkasiZoho.Round2;

public class MatrixTraverse {
    /*
•    Given a matrix NxN, you are initially in the 0, 0 position. The matrix is filled with ones and zeros. Value “one” represents the path is available, while “zero” represents the wall. You need to find the can you able to reach the (N-1)x(N-1) index in the matrix. You can move only along the right and down directions if there’s “one” available.
•	Input:
•	5 //N value
•	1 0 1 0 0
•	1 1 1 1 1
•	0 0 0 1 0
•	1 0 1 1 1
•	0 1 1 0 1
*/
    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 0},
                {0, 1, 1, 0, 1}
        };
        System.out.println(find(a,0,0));
//            System.out.println("no");
    }
    static boolean find(int [][]a,int i,int j){
        //element 1 aa irukka
        if(i>= a.length || j>= a[0].length || a[i][j] == 0){
            return false;
        }
        // i,j now out of bounds
        if(i== a.length-1 && j==a.length-1) {

            return true;
        }
        else if((i<a.length-1 && a[i+1][j] !=1) && (j<a[0].length-1 && a[i][j+1] != 1 )){
            return false;
        }
        return find(a,i+1,j)||
        find(a,i,j+1);

    }
}
