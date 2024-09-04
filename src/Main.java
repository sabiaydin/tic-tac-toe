import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
             board[i][j] = '-';
            }
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Tic Tac Toe is ready for play!\n");
        System.out.print("What is your name?, player 1: ");
        String p1 = in.nextLine();
        System.out.print(" What is your name?, player 2: ");
        String p2 = in.nextLine();

        boolean player1 = true;
        boolean gameEnded = false;
        while (!gameEnded) {
            Operations.drawBoard(board);
            if (player1) {
                System.out.println(p1 + "'s Turn(x): ");
            } else {
                System.out.println(p2 + "'s Turn(o): ");
            }
            char c = '-';
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }
            int row = 0;
            int column = 0;
            while (true){
            System.out.print("Enter a row number: ");
            row = in.nextInt();
            System.out.print("Enter a column number: ");
            column = in.nextInt();
            if (row < 0 && column < 0 || row >= n && column >= n) {
                System.out.println("This position is off the bounds of the board! Try again.");
            } else if (board[row][column] != '-') {
                System.out.println("Someone has already made a move at this position! Try again.");
            }
            else {
                break;
            }
        }
        board[row][column]=c;
            if(Operations.playerHasWon(board) == 'x') {
                System.out.println(p1 + " has won!");
                gameEnded = true;
            } else if(Operations.playerHasWon(board) == 'o') {
                System.out.println(p2 + " has won!");
                gameEnded = true;
            } else {

                if(Operations.boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {

                    player1 = !player1;
                }
            }
        }

        Operations.drawBoard(board);
    }
}
