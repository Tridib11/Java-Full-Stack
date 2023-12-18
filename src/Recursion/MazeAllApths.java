package Recursion;

public class MazeAllApths {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        AllPaths("",board,0,0);
    }
    static void AllPaths(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            AllPaths(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            AllPaths(p+'R',maze,r,c+1);
        }
        if(r>0){
            AllPaths(p+'U',maze,r-1,c);
        }
        if(c>0){
            AllPaths(p+'L',maze,r,c-1);
        }
        maze[r][c]=true;

    }


}
