package Maze;

public class Maze {
    public static void main(String[] args) {
        int paths = count(3,3); //maze:3x3
        System.out.println("Total Path to reach (1,1):"+paths);

    }

    static int count(int row, int col){

        if(row==1 || col ==1){
            return 1;
        }
        int left = count(row-1,col);  //always left tree first comes
        int right = count(row,col-1);

        return left+right;
    }
}
