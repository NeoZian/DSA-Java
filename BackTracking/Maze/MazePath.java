package Maze;

public class MazePath {
    public static void main(String[] args) {

        path("",3,3);  //maze:3x3

    }

    static void path(String p,int row, int col){
        if(row == 1 && col==1){  //both row & col should be 1 to reach the destination for printing the path
            System.out.println(p);
            return;
        }

        if (row>1){
            path(p+'D',row-1, col);  //going downside
        }
        if (col>1){
            path(p+'R',row, col-1);  //going Right side
        }

    }
}
