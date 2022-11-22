package Maze;

public class MazeWithObstacle {
    public static void main(String[] args) {

        boolean[][] board = {          //3x3 maze board where all are true except the obstacle one
                {true,true,true},     // that's why that one is kept as false to recognise than other cells
                {true,false,true},
                {true,true,true}
        };
        obstacles("",0,0,board);

    }

    static void obstacles(String p, int row, int col, boolean[][] maze){
        //assuming the board has indexing from 0,0 we could assume the opposite as well

        if(row==maze.length-1 && col== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[row][col]==false){ // or (!maze[row][col]) also works
            return;
        }
        if (maze.length-1>row){
            obstacles(p+'D',row+1,col, maze);
        }
        if (maze[0].length-1>col){
            obstacles(p+'R',row,col+1, maze);
        }



    }
}
