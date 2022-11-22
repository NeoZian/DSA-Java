package BackTrack;

import java.util.Arrays;

public class MatrixPathBackTrack {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path =new int[board.length][board[0].length];
        backTrackingAllPath("",0,0, board, path, 1);  //empty array and step from 1

    }

    static void backTrackingAllPath(String p, int row, int col, boolean[][] maze, int[][] path, int step){
        if(row == maze.length-1 && col == maze[0].length-1){  //base condition
            //we wanna print path here when destination is found
            path[row][col] = step;  //reaching at the destination, its a path too, so we need to add it to the array too!!!
            for(int[] arr:path){ //printing the 2d array till the destination
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);  //the path DDRR etc
            System.out.println();  //newline to distinct
            return;
        }

        if(maze[row][col] == false){  //if it false its gonna return
            return;
        }

        //consider false block in the path
        //this block is in my path actually
        maze[row][col] = false;
        path[row][col] = step; // step values are set in the path like [1  2  3 ...]


        if(row<maze.length-1){
            backTrackingAllPath(p+'D',row+1,col,maze, path, step+1);
        }
        if(col<maze[0].length-1){
            backTrackingAllPath(p+'R',row,col+1,maze, path, step+1);
        }
        if (row>0){
            backTrackingAllPath(p+'U',row-1, col, maze, path, step+1);
        }
        if (col>0){
            backTrackingAllPath(p+'L',row,col-1, maze, path, step+1);
        }

        //in this line all the function calls are over
        // so before the function gets removed from the stack, also remove the changes that were made by that function

        maze[row][col] = true; //restoring previous values, or undoing previous change
        path[row][col] = 0;  //making it 0 while tracking back

    }
}
