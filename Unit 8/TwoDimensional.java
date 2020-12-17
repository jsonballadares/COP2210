import java.util.Arrays;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 0;
                } else {
                    board[i][j] = 1;
                }
            }
        }
        printTwoDimensional(board);

    }

    public static void printTwoDimensional(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
