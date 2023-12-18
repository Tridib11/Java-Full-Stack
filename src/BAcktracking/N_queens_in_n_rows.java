package BAcktracking;

public class N_queens_in_n_rows {
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        if(nQueens(board,0)){
            printBoard(board);
        }
        else {
            System.out.println("Solution not possible");
        }
    }
    static boolean nQueens(char[][] board,int row){
        if(row==board.length){
//            printBoard(board);
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueens(board,row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }
        return false;
    }
    static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for (int i = row-1; i >=0 ; i--) {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j< board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    static void printBoard(char Board[][]){
        System.out.println("--------");
        for(int i=0;i< Board.length;i++){
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
    }
}