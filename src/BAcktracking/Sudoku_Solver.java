package BAcktracking;
//https://leetcode.com/problems/sudoku-solver/description/
public class Sudoku_Solver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Original Sudoku Board:");
        printBoard(board);

        solveSudoku(board);

        System.out.println("\nModified Sudoku Board:");
        printBoard(board);

    }
    static void solveSudoku(char[][] board){
        solve(board,0,0);
    }
    static boolean solve(char[][] board,int row,int col){
        //base case if row equals to board length, entire body has been filled
        if(row==board.length){
            return true;
        }
        //Move to next row when the current row is filled
        if(col==board[0].length){
            return solve(board,row+1,0);
        }
        //Skip cells that are already filled
        if(board[row][col]!='.'){
            return solve(board,row,col+1);
        }
        //try differnt numbers in the current cell
        for(char num='1';num<='9';num++){
            if(isValidPlacement(board,row,col,num)){
                board[row][col]=num;

                //move to the next cell
                if(solve(board,row,col+1)){
                    return true;
                }

                //backtrack to the previous step if the solution is not found
                board[row][col]='.';
            }
        }
        return false;
    }

   static boolean isValidPlacement(char[][] board, int row, int col, char num) {
        for(int i =0;i< board.length;i++){
            //check row
            if(board[i][col]==num){
                return false;
            }
            //check coloums
            if(board[row][i]==num){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }


    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
