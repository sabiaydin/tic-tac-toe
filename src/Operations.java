public class Operations {
    public static void drawBoard(char[][] board) {
        System.out.println("Board:");
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }
    public static  char playerHasWon(char[][] board){
        for (char[] chars : board) {
            boolean inARow = true;
            char value = chars[0];
            if (value == '-') {
                inARow = false;
            } else {
                for (int j = 1; j < chars.length; j++) {
                    if (chars[j] != value) {
                        inARow = false;
                        break;
                    }
                }
            }
            if (inARow) {
                return value;
            }
        }
        for(int j = 0; j < board[0].length; j++) {
            boolean inACol = true;
            char value = board[0][j];

            if(value == '-') {
                inACol = false;
            } else {

                for(int i = 1; i < board.length; i++) {
                    if(board[i][j] != value) {
                        inACol = false;
                        break;
                    }
                }
            } if(inACol) {

                return value;
            }
        } boolean inADiag1 = true;
        char value1 = board[0][0];
        if(value1 == '-') {
            inADiag1 = false;
        } else {
            for(int i = 1; i < board.length; i++) {
                if(board[i][i] != value1) {
                    inADiag1 = false;
                    break;
                }
            }
        }

        if(inADiag1) {
            return value1;
        }boolean inADiag2 = true;
        char value2 = board[0][board.length-1];

        if(value2 == '-') {
            inADiag2 = false;
        } else {
            for(int i = 1; i < board.length; i++) {
                if(board[i][board.length-1-i] != value2) {
                    inADiag2 = false;
                    break;
                }
            }
        }

        if(inADiag2) {
            return value2;
        } return ' ';}
    public static boolean boardIsFull(char[][] board1) {
        for (char[] chars : board1) {
            for (char aChar : chars) {
                if (aChar == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
