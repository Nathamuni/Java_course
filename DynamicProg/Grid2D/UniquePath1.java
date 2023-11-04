package Interview.DynamicProg.Grid2D;

public class UniquePath1 {
    public static void main(String[] args) {
        int[][] arr = { {1, 1, 1, 1},

                {2, 2, 2, 2},

                {3, 3, 3, 3} };
        System.out.println(f(169,3));
        System.out.println(f2(169,3));
    }

    private static long f(int i,int j) {

        if(i==0 && j==0)
                return 1;
        if(i<0 || j<0)
            return 0;
        long up = f(i-1,j);
        long left = f(i,j-1);
        return up+left;
    }
//   memoization (over-lapping sub problems)
    private static long f2(int i,int j) {
        long [][]a = new long[i+1][j+1];
        //if(i>=0 && j>= 0 && a[i][j]==-1)return 0;// if any Obstracles named -1
        if(i<0 || j<0)// since we are using a[i][j] since it should not check i-1,j-1...
            return 0;
        if(a[i][j] !=0) {
            return a[i][j];
        }
        if(i==0 && j==0) {
            return a[i][j]+= 1;
        }
        long up = f2(i-1,j);
        long left = f2(i,j-1);
        return a[i][j]=up+left;
    }

}
