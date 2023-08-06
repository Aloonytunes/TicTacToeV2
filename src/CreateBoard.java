import java.util.ArrayList;

public class CreateBoard {
   public static ArrayList<Integer> availableSpots = new ArrayList<Integer>();
   public static String[][] board = draw();
    public static String[][] draw() {
        String[][] myBoard = {
                {" ", " | ", " ", " | ", " "},
                {"- ", "+ ", "- ", "+ ", "- "},
                {" ", " | ", " ", " | ", " "},
                {"- ", "+ ", "- ", "+ ", "- "},
                {" ", " | ", " ", " | ", " "}

        };
        printBoard(myBoard);
        addAvailableSpots();
        return myBoard;

    }
    public static void printBoard(String[][] myBoard) {
        for (int i = 0; i < myBoard.length; i++) {
            System.out.println();
            for (int j = 0; j < myBoard[i].length; j++) {
                System.out.print(myBoard[i][j]);
            }
        }
    }

    public static void addAvailableSpots() {
        for (int i = 1; i < 10; i++) {
            availableSpots.add(i);
        }

    }

}
