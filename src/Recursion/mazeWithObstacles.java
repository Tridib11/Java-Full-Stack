//package Recursion;
//
//public class mazeWithObstacles {
//    static int pathCount = 0;
//    public static void Exception_check(String[] args) {
//        boolean[][] board={
//                {true,false},
//                {true,true}
//        };
//        pathRestrictions("",board,0,0);
//        System.out.println("Total paths: " + pathCount);
//    }
//    static void pathRestrictions(String p,boolean[][] maze,int r,int c){
//        if(r==maze.length-1 && c==maze[0].length-1){
////            System.out.println(p);
//            pathCount++;
//            return;
//        }
//        if(!maze[r][c]){
//            return;
//        }
//        if(r<maze.length-1){
//            pathRestrictions(p+'D',maze,r+1,c);
//        }
//        if(c<maze[0].length-1){
//            pathRestrictions(p+'R',maze,r,c+1);
//        }
//    }
//}

package Recursion;
public class mazeWithObstacles {
    static int pathCount = 0;
    public static void main(String[] args) {
        int[][] board = {
                {0, 1},
                {0, 0}
        };
        System.out.println(uniquePathsWithObstacles(board));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        pathRestrictions("", obstacleGrid, 0, 0);
        return pathCount;
    }
    static void pathRestrictions(String p, int[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
             System.out.println(p);
            pathCount++;
            return;
        }
        if (maze[r][c] == 1) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}
