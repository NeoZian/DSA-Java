package NQueenNightsSudoku;

public class SudokuSolver  {
    public static void main(String[] args) {

       int[][] board =  {   //assuming all the missing numbers are initially 0
               {5,3,0,0,7,0,0,0,0},
               {6,0,0,1,9,5,0,0,0},
               {0,9,8,0,0,0,0,6,0},
               {8,0,0,0,6,0,0,0,3},
               {4,0,0,8,0,3,0,0,1},
               {7,0,0,0,2,0,0,0,6},
               {0,6,0,0,0,0,2,8,0},
               {0,0,0,4,1,9,0,0,5},
               {0,0,0,0,8,0,0,7,9}
       };


       sudokuSolver(board);
       display(board);
    }

    static boolean sudokuSolver(int[][] board){

        int len = board.length;
        //traversing the board
        for (int row = 0; row <len ; row++) {
            for (int col = 0; col <len ; col++) {

                if(board[row][col] == 0){
                    //putting values from 1-9
                    for (int val = 1; val <=9 ; val++) {
                        if(isSafe(board,row,col,val)){

                            board[row][col] = val;
                            //recursive call
                            boolean isSolution = sudokuSolver(board);

                            if(isSolution==true){
                                return true;
                            }
                            else {
                                //backTrack
                                board[row][col] = 0;   //restoring the previous value
                            }
                        }

                    }
                    //nothing found trying 1-9
                    return false;
                }
            }
        }
        return true;  //we've found
    }

    static boolean isSafe(int[][] board, int row, int col, int val){
        //checking 3 constraints
        //checking in that row (row stable, col moving )
        //if the value we are putting found in that row then xsad
        for (int i = 0; i < board.length; i++) {
            if(board[row][col]==val){
                return false;
            }
        }


        //checking in that col (row moving, col stable )
        //if the value we are putting found in that col then xsad
        for (int i = 0; i < board.length; i++) {
            if(board[i][col]==val){
                return false;
            }
        }

        //in the box, but we need find out the box size first
        //box size == sqrt of the length of the board

        int box_size = (int) (Math.sqrt(board.length));
        int rowStart = row - row % box_size ;
        int colStart = col - col % box_size;


        for (int i = rowStart; i <rowStart+box_size ; i++) {
            for (int j = colStart; j <colStart+box_size ; j++) {
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;

    }

    static void display(int[][] board){

        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
    }
}
