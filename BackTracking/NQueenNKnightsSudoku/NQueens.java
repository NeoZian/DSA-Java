package NQueenNightsSudoku;

public class NQueens {
    public static void main(String[] args) {

        int n =4; //board size
        boolean[][] board = new boolean[n][n];  //creating empty boolean type 2d array
        int count_total_solutions = queens(board,0); //start checking from row 0
                                                 // printing to count the total number of solution
        System.out.println(count_total_solutions);

    }

    static int queens(boolean[][] board, int row){  // just having row is enough since nxn
        if(row == board.length){     //that means checking is complete , remember: its board.length like 4(for 4x4 table) because after the
                                    // last call it becomes equal to length 4, but mainly for a 4x4 table max length is 3
            display(board);
            System.out.println(); //to distinct one board from another
            return 1;
        }

        int count =0;

        //placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {  //since col-length is as same as board length: nxn
            //place the queen if it is safe to place based on constraints
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count + queens(board,row+1);  //counting total solutions too
                board[row][col] =false;  //backTracking, reversing/restoring the value

            }

        }
        return count;
    }



    static boolean isSafe(boolean[][] board, int row, int col){

        //checking all 3 possible cases

            //checking vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]){   //when true means already that has been taken by other queen
                return false;  //can't place here
            }
        }

        //diagonal Left
        //maximum how long we can go left diagonally is ==> minimum value of current row/col, min(row,col)
        int maxLeft = Math.min(row,col);  //we can run the loop for this long
        for (int i = 0; i < maxLeft; i++) {
            if(board[row-1][col-1]){   // if that's true==> taken by someone
                return false;
            }
        }


        //diagonal Right
        //maximum how long we can go right diagonally is ==> Minimum of (row, total length of col - current_col -1)
        int maxRight = Math.min(row, board.length - col -1); //we can run the loop for this long
        for (int i = 0; i < maxRight; i++) {
            if(board[row-1][col+1]){   // if that's true==> taken by someone
                return false;
            }
        }

        //if none of them returns false that means the cell is safe for queen to place(true)

        return true;

    }


    static void display(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element: row){
                if (element){
                    System.out.print("Q ");  //only where the queens can be placed are true;
                }
                else {
                    System.out.print("x ");  //putting x where the queens can't be placed
                }
            }
            System.out.println(); //new line after 1st row
        }
    }

}
