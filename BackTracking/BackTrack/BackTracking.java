package BackTrack;

public class BackTracking {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        backTracking("",0,0, board);

    }

    static void backTracking(String p, int row, int col, boolean[][] maze){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[row][col] == false){  //if it false its gonna return
            return;
        }

        //consider false block in the path
        maze[row][col] = false;  //making the current cell as false since, among the next 4 statements, one is gonna execute
                                // that means we'll move towards left/right/up/down so the current cell should be false
                               // as it has been visited once!

        if(row<maze.length-1){
            backTracking(p+'D',row+1,col,maze);
        }
        if(col<maze[0].length-1){
            backTracking(p+'R',row,col+1,maze);
        }
        if (row>0){
            backTracking(p+'U',row-1, col, maze);
        }
        if (col>0){
            backTracking(p+'L',row,col-1, maze);
        }

        //in this line all the function calls are over
       // so before the function gets removed from the stack, also remove the changes that were made by that function

        maze[row][col] = true; //restoring previous values, or undoing previous change
                              // since when returning we might find the previous cell false
                            // so now the stack is getting removed and were undoing the changes made so that..
                            // we can track back--> that's called as BackTrack.BackTracking
    }
}
