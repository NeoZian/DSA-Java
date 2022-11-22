package NQueenNightsSudoku;

public class NKnights {
    public static void main(String[] args) {
        int n=4;  //board size 4x4
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,4); //4== number of knights to be placed
    }

    static void knight(boolean[][] board, int row, int col, int knights){

        if(knights==0){
            display(board);
            System.out.println();  //to put some space between the solutions
            return;
        }
            //array bound checker for the position (n,n) == the last cell of row and column
        if(row == board.length-1 && col== board.length){  // for column=> it's not board.length-1 because when its after the last
            // last cell, that means: n,n+1 : out of the board for the last row
            return;
        }

        if(col == board.length){ //got to go to the next row, 0th column
            knight(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            knight(board,row,col+1,knights-1);
            board[row][col] = false;
        }
//        else {
//            knight(board,row,col+1,knights);
//        }
       knight(board,row,col+1,knights);   //could place this line here too

    }

    static boolean isSafe(boolean[][] board, int row,int col){

        //4 conditions for a knight to move various directions
        if (isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        if (isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if (isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        if (isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;

    }
    static boolean isValid(boolean[][] board, int row, int col){  // to avoid repetition again and again
        if((row>=0 && row<board.length) && (col>=0 && col< board.length)){ // checking whether the cell is inside the board / bound
            return true;
        }
        return false;
    }

    static void display(boolean[][] board){
        int len = board.length; //===column length

        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len ; j++) {
                if (board[i][j]){
                    System.out.print("K ");
                }
                else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }

//        for (boolean[] row: board){
//            for (boolean element: row){
//                if(element){
//                    System.out.println("K ");
//                }
//                else {
//                    System.out.println("x ");
//                }
//            }
//            System.out.println();
//        }

    }
}
