package Interview.DynamicProg.Grid2D;

public class PathWithObstracles {
    public static void main(String[] args) {
        int[][] arr = { {1, 1},
                {-1, 1} };

        System.out.println(f2(1,1,arr));
    }

    //   memoization (over-lapping sub problems)
    private static long f2(int i,int j,int[][]arr) {
        long [][]a = new long[i+1][j+1];
        if(i>=0 && j>= 0 && arr[i][j]==-1)return 0;// if any Obstracles named -1
        if(i<0 || j<0)// since we are using a[i][j] since it should not check i-1,j-1...
            return 0;
        if(a[i][j] !=0) {
            return a[i][j];
        }
        if(i==0 && j==0) {
            return a[i][j]+= 1;
        }
        long up = f2(i-1,j,arr);
        long left = f2(i,j-1,arr);
        return a[i][j]=up+left;
    }
}
