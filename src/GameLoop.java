public class GameLoop {
    public static boolean winCheck() {
        boolean gameOver = false;
        String winner = "";
        for (int row = 0; row <= 4; row += 2) {
            if (CreateBoard.board[row][0] != " ") {
                if (CreateBoard.board[row][0] == "X") {
                    winner = "X";
                }else {
                    winner = "O";
                }
                if (CreateBoard.board[row][0] == CreateBoard.board[row][2] && CreateBoard.board[row][2] == CreateBoard.board[row][4]) {
                    gameOver = true;
                    System.out.println(winner + " is the winner");
                }
            }
        }
        for (int col = 0; col <= 4; col += 2) {
            if (CreateBoard.board[0][col] != " ") {
                if (CreateBoard.board[0][col] == "X") {
                    winner = "X";
                }else {
                    winner = "O";
                }
                if (CreateBoard.board[0][col] == CreateBoard.board[2][col] && CreateBoard.board[2][col] == CreateBoard.board[4][col]) {
                    gameOver = true;
                    System.out.println(winner + " is the winner");
                }
            }
        }

        if (CreateBoard.board[2][2] != " ") {
            if (CreateBoard.board[2][2] == "X") {
                winner = "X";
            }else {
                winner = "O";
            }
            if ((CreateBoard.board[0][0] == CreateBoard.board[2][2] && CreateBoard.board[2][2] == CreateBoard.board[4][4])
                    || (CreateBoard.board[0][4] == CreateBoard.board[2][2] && CreateBoard.board[2][2] == CreateBoard.board[4][0])) {
                gameOver = true;
                System.out.println(winner + " is the winner");
            }
        }

        if (CreateBoard.availableSpots.size() == 0) {
            gameOver = true;
            System.out.println("Draw");
        }
        return gameOver;
    }

    public static void gameplay() {
        Players.player1Turn(CreateBoard.board, CreateBoard.availableSpots);
    }
}
