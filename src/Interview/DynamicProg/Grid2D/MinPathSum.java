package Interview.DynamicProg.Grid2D;

public class MinPathSum {

    public static void main(String[] args) {
        int[][] arr = { {1, 65763,4,55},

                {25, 458, 10, 232},

                {3234, 323, 13, 16} };

        System.out.println(f2(2,3,arr));
    }
    private static long f2(int i,int j,int[][]arr) {

        if(i==0 && j==0 )// if we put i,j>0 it will return that value itself
            return arr[i][j];
        if(i<0 || j<0)
            return Integer.MAX_VALUE;// take a value which is out of consideration

        long up = arr[i][j]+f2(i-1,j,arr);// even if it is -1 and then after base condition
//        it will check for j-1 with i =0 and again i=-1 this cycle continues for each j decrement
        long left =arr[i][j]+ f2(i,j-1,arr);
        return Math.min(up,left);
    }
}
