package Maze;

import java.util.ArrayList;

public class MazePathDiagonal {
    public static void main(String[] args) {

        System.out.println(pathDiagonal("",3,3));  //maze:3x3

    }

    static ArrayList<String> pathDiagonal(String p, int row, int col){
        if(row == 1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();


        ///DIAGONAL checking here
        if(row>1 && col >1){
            list.addAll(pathDiagonal(p+'D',row-1,col-1)); //D=DIAGONAL
        }

        if (row>1){
            list.addAll(pathDiagonal(p+'V',row-1, col));  //going downside=VERTICALLY = V
        }
        if (col>1){
            list.addAll(pathDiagonal(p+'H',row, col-1));  //going Right side =HORIZONTAL = H
        }
        return list;

    }
}
