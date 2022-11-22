package Maze;

import java.util.ArrayList;

public class MazePathAL {
    public static void main(String[] args) {

        System.out.println(path("",3,3));  //maze:3x3

    }

    static ArrayList<String> path(String p, int row, int col){
        if(row == 1 && col==1){  //both row & col should be 1 to reach the destination for printing the path
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (row>1){
            list.addAll(path(p+'D',row-1, col));  //going downside
        }
        if (col>1){
           list.addAll(path(p+'R',row, col-1));  //going Right side
        }
        return list;

    }
}
