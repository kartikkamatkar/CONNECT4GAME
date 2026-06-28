import java.util.Random;
import java.util.Scanner;

public class ConnectFour {

    static char[][] board = new char[6][7];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                board[i][j] = '.';

        while (true) {

            printBoard();
            System.out.print("Enter column (0-6): ");
            int col = sc.nextInt();

            if (!drop(col, 'X')) {
                System.out.println("Invalid Move!");
                continue;
            }

            if (win('X')) {
                printBoard();
                System.out.println("You Win!");
                break;
            }
            int aiCol;
            do {
                aiCol = random.nextInt(7);
            } while (!drop(aiCol, 'O'));

            System.out.println("Computer played column " + aiCol);

            if (win('O')) {
                printBoard();
                System.out.println("Computer Wins!");
                break;
            }
        }

        sc.close();
    }

    static void printBoard() {
        for (
                char[] row : board) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
        System.out.println();
    }

    static boolean drop(int col, char player) {
        if (col < 0 || col > 6)
            return false;

        for (int i = 5; i >= 0; i--) {
            if (board[i][col] == '.') {
                board[i][col] = player;
                return true;
            }
        }
        return false;
    }
    static boolean win(char p) {
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 4; j++)
                if (board[i][j] == p && board[i][j + 1] == p &&
                        board[i][j + 2] == p && board[i][j + 3] == p)
                    return true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 7; j++)
                if (board[i][j] == p && board[i + 1][j] == p &&
                        board[i + 2][j] == p && board[i + 3][j] == p)
                    return true;

        return false;
    }
}