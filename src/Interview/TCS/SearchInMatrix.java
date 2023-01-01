package Interview.TCS;

/*Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given.
The task is to find whether element X is present in the matrix or not.*/

public class SearchInMatrix {
// constraint is to find the number on O(m+n)
    /*
    N = 3, M = 3
    mat[][] =
         3 30 38
         44 52 54
         57 60 69
    X = 62*/
    public static void main(String[] args) {
        int N=3,M=3;
        int  X = 52;
       int mat[][] =
                       {{3, 30, 38},
                       {44, 52, 54},
                       {57, 60, 69}};
        System.out.println(matSearch(mat,N,M,X));
    }
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        int l1=0,r1=0,l2=N-1,r2=M-1;
        int mid1=1,mid2 =1;
        while(mid1 != l1 && mid2 != l2 ){
            mid1 = (l1+l2)/2;
            mid2 = (r1+r2)/2;
          if(mat[mid1][mid2] == X) return 1;
          else if(X<mat[mid1][mid2]){
              l2 = mid1;
              r2 = mid2;
          }
          else if(X>mat[mid1][mid2]){
              l1 = mid1;
              r1= mid2;
          }
        }
        return 0;
    }
}
