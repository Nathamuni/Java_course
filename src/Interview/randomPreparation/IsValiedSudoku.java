package Interview.randomPreparation;

import java.util.ArrayList;

public class IsValiedSudoku {
    public static void main(String[] args) {
        String[][] a = {{"5","3",".",".","7",".",".",".","."}
        ,{"6",".",".","1","9","5",".",".","."},
        {".","9","8",".",".",".",".","6","."}
        ,{"8",".",".",".","6",".",".",".","3"}
        ,{"4",".",".","8",".","3",".",".","1"}
        ,{"7",".",".",".","2",".",".",".","6"}
        ,{".","6",".",".",".",".","2","8","."}
        ,{".",".",".","4","1","9",".",".","5"}
        ,{".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(a));
    }
    public static boolean isValidSudoku(String[][] board) {
        int sq=0;

    for(int i =0; i< board.length;i++){
        ArrayList aly = new ArrayList<>();
        ArrayList aly1 = new ArrayList<>();
        ArrayList square = new ArrayList<>();
        for(int j =0; j< board.length;j++){
            if(aly.contains(board[i][j]) && !(board[i][j]).equals(".")){
                return  false;
            }
            if(aly1.contains(board[j][i]) && !(board[j][i]).equals(".")){
                return  false;
            }
            aly.add(board[i][j]);
            aly1.add(board[j][i]);

        }

    }
    while(sq< board.length){

        sq += 3;
        for(int i =sq-3; i< sq;i++) {
            ArrayList square = new ArrayList<>();
            for (int j = sq-3; j < sq; j++) {
                if (square.contains(board[i][j]) && !(board[i][j]).equals(".")) {
                    return false;
                }
                square.add(board[i][j]);
            }
        }
    }
       return true;
    }
}
