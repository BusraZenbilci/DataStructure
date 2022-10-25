
public class TicTacTog {

    private int [] [] board;

    public static final int X = 1 , O = -1 , EMPTY = 0;

    private int currentPlayer;

    private static final int [] [] [] winnerPosition = {
            { {0,0} , {0,1} , {0,2} } ,
            { {1,0} , {1,1} , {1,2} } ,
            { {2,0} , {2,1} , {2,2} } ,
            { {0,0} , {1,0} , {2,0} } ,
            { {0,1} , {1,1} , {2,1} } ,
            { {0,2} , {1,1} , {2,2} }

    };
    public TicTacTog() {
        this.board = new int[3][3];
        this.currentPlayer = X ;

    }

    public static void main(String[] args) {


    }

    public void printBoard () {

        for (int [] line: board) {

            for(int cell : line){

                if(cell == 0)
                    System.out.print("-");
                else if(cell == 1)
                    System.out.print("X");
                else if (cell == -1)
                    System.out.print("O");
            }

            System.out.println("");
        }

      /*

        for (int i = 0 ; i<3 ; i++){

            for(int j = 0 ; j<3 ; j++) {

                if(board[i][j] == 0)
                    System.out.print("-");
                else if( board[i][j] == 1)
                    System.out.println("X");
                else if (board [i][j] == -1) {
                    System.out.print("O");
                }
            }
        }

        */

    }

    public void putMark (int x , int y) {
        if(x>2 || y>2 || x<0 || y<0)
            throw new IllegalArgumentException("x and y must between 0 and 2");

        if(board[x][y] != EMPTY)
            throw new IllegalArgumentException("Space is not empty.");


        this.board [x][y] = currentPlayer;

        currentPlayer = currentPlayer * -1;
    }

    private boolean isWinner(int player) {
        for (int [][] positions : winnerPosition) {
            int sum=0;
            for (int [] position : positions){
                int value = board[position[0]]  [position[1]];
            }
            if(sum == (player*3)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPlayablePositionExist(){
        for(int [] line : board) {
            for (int cell : line) {

            }
        }
    }

    private int getWinner(){
        if(isWinner(X)){
            return X;
        }
        else if(isWinner(0)) {
            return 0;
        }
        else if(!isPlayablePositionExist()) {
            return EMPTY;
        }
        return Integer.MIN_VALUE;
    }

}
