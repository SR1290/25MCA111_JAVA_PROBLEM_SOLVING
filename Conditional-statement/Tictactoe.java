package conditionalstatement;
import java.util.Scanner;
public class Tictactoe {
	/**
	 * 10. Tic Tac Toe using Switch Case (Advanced)
    Simulate basic game logic with switch cases.
	 */

	public static void main(String[] args) {
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        Scanner sc = new Scanner(System.in);

        for (int turn = 0; turn < 9; turn++) {
            System.out.print("Enter position (1-9): ");
            int pos = sc.nextInt() - 1;
            char player = (turn % 2 == 0) ? 'X' : 'O';

            if (pos >= 0 && pos < 9 && board[pos] == ' ') {
                board[pos] = player;
            } else {
                System.out.println("Invalid Move, try again!");
                turn--;
                continue;
            }

            // Display board
            for (int i = 0; i < 9; i++) {
                System.out.print(board[i] == ' ' ? "_" : board[i]);
                if ((i + 1) % 3 == 0) System.out.println();
                else System.out.print(" | ");
            }

            // Check win
            int[][] win = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
            for (int[] w : win) {
                if (board[w[0]] != ' ' && board[w[0]] == board[w[1]] && board[w[1]] == board[w[2]]) {
                    System.out.println(player + " wins!");
                    return;
                }
            }
        }
        System.out.println("Draw!");

		
	}

}
