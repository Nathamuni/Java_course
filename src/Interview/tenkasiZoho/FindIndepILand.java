package Interview.tenkasiZoho;

public class FindIndepILand {
    public static void main(String[] args) {
        int[][] a ={{1,0,0,1,1},
                    {1,1,0,0,0},
                    {1,0,0,0,1},
                    {0,0,0,1,0},
                    {1,0,0,0,1}};
        for(int i=0; i<a.length ; i++){
            for(int j =0; j<a[0].length; j++){
                if(a[i][j]==1){
                    count++;
                    MakeNeibhoursMinusOne(i,j,a);
                }
            }
        }
        System.out.println(count);
    }
    static int count =0;
//    public static int fun(int i , int j, int a[][]){
//        for()
//    }

    public static void MakeNeibhoursMinusOne(int row, int col ,int[][]a){

        if(row <0 || col <0 ||row >=a.length || col >= a[0].length || a[row][col] != 1)
            return;

        a[row][col] = -1;

        //diagonal
        MakeNeibhoursMinusOne(row-1,col-1,a);
        MakeNeibhoursMinusOne(row+1,col+1,a);
        MakeNeibhoursMinusOne(row+1,col-1,a);
        MakeNeibhoursMinusOne(row-1,col+1,a);

        //straight
        MakeNeibhoursMinusOne(row-1,col,a);
        MakeNeibhoursMinusOne(row,col-1,a);
        MakeNeibhoursMinusOne(row+1,col,a);
        MakeNeibhoursMinusOne(row,col+1,a);

    }
}


/*
public class IslandCounter {
    public static void main(String args[]) {

        int[][] grid = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0}
        };


        // IslandCounter ic = new IslandCounter();
        System.out.println(countIslands(grid));

    }
    static int countIslands(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    static void dfs(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != 1) {
            return;
        }

        grid[row][col] = -1; // Mark the current land as visited

        // Recursively explore the adjacent lands (including diagonals)
        dfs(grid, row - 1, col); // Up
        dfs(grid, row + 1, col); // Down
        dfs(grid, row, col - 1); // Left
        dfs(grid, row, col + 1); // Right
        dfs(grid, row - 1, col - 1); // Up-Left
        dfs(grid, row - 1, col + 1); // Up-Right
        dfs(grid, row + 1, col - 1); // Down-Left
        dfs(grid, row + 1, col + 1); // Down-Right
    }
}*/
