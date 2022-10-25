public class App {
    public static void main(String [] args) throws Exception {
        TicTacTog tic = new TicTacTog();

        tic.printBoard();
        tic.putMark(0 , 1);
        tic.putMark(1 , 0);
        tic.putMark(0,  2);
        tic.putMark(1 , 1);
        tic.putMark(2 , 0);
        tic.putMark(1 , 2);
        tic.printBoard();

        tic.printBoard();
        tic.putMark(0,2);
        System.out.println();

        tic.printBoard();
        try {

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lütfen duzgun bir deger gir.");
        }
        tic.putMark(0,3);
        System.out.println("Put mark metodu calıstırılıyor.");

    }
}
