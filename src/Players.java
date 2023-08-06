import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    //public static CreateBoard createBoard = new CreateBoard();

    public static void player1Turn(String[][] gameBoard, ArrayList<Integer> availableSpots) {
        System.out.println();
        try {
            if (GameLoop.winCheck() == false) {
                Scanner myScanner = new Scanner(System.in);
                System.out.println("Player 1 choose a number 1-9 to place an X");
                int p1Input = myScanner.nextInt();

                if (String.valueOf(p1Input).length() == 1) {
                    if (availableSpots.contains(p1Input)) {
                        switch (p1Input) {
                            case 1: {
                                gameBoard[0][0] = "X";
                                break;
                            }
                            case 2: {
                                gameBoard[0][2] = "X";
                                break;
                            }
                            case 3: {
                                gameBoard[0][4] = "X";
                                break;
                            }
                            case 4: {
                                gameBoard[2][0] = "X";
                                break;
                            }
                            case 5: {
                                gameBoard[2][2] = "X";
                                break;
                            }
                            case 6: {
                                gameBoard[2][4] = "X";
                                break;
                            }
                            case 7: {
                                gameBoard[4][0] = "X";
                                break;
                            }
                            case 8: {
                                gameBoard[4][2] = "X";
                                break;
                            }
                            case 9: {
                                gameBoard[4][4] = "X";
                                break;
                            }
                        }
                        availableSpots.remove(Integer.valueOf(p1Input));
                        CreateBoard.printBoard(gameBoard);
                    } else if (availableSpots.size() > 0) {
                        System.out.println("Please pick an available spot");
                        player1Turn(gameBoard, availableSpots);
                    }
                } else {
                    player1Turn(CreateBoard.board, CreateBoard.availableSpots);
                }
                player2Turn(CreateBoard.board, CreateBoard.availableSpots);
            }
        } catch (Exception e) {
            System.out.println("Please pick a valid input");
            player1Turn(CreateBoard.board, CreateBoard.availableSpots);
        }
    }

        public static void player2Turn (String[][]gameBoard, ArrayList < Integer > availableSpots){
            System.out.println();
            try {
                if (GameLoop.winCheck() == false) {
                    Scanner myScanner = new Scanner(System.in);
                    System.out.println("Player 2 choose a number 1-9 to place an O");
                    int p2Input = myScanner.nextInt();
                    if (String.valueOf(p2Input).length() == 1) {
                        if (availableSpots.contains(p2Input)) {
                            switch (p2Input) {
                                case 1: {
                                    gameBoard[0][0] = "O";
                                    break;
                                }
                                case 2: {
                                    gameBoard[0][2] = "O";
                                    break;
                                }
                                case 3: {
                                    gameBoard[0][4] = "O";
                                    break;
                                }
                                case 4: {
                                    gameBoard[2][0] = "O";
                                    break;
                                }
                                case 5: {
                                    gameBoard[2][2] = "O";
                                    break;
                                }
                                case 6: {
                                    gameBoard[2][4] = "O";
                                    break;
                                }
                                case 7: {
                                    gameBoard[4][0] = "O";
                                    break;
                                }
                                case 8: {
                                    gameBoard[4][2] = "O";
                                    break;
                                }
                                case 9: {
                                    gameBoard[4][4] = "O";
                                    break;
                                }
                            }
                            availableSpots.remove(Integer.valueOf(p2Input));
                            CreateBoard.printBoard(gameBoard);

                        } else if (availableSpots.size() > 0) {
                            System.out.println("Please pick an available spot");
                            player2Turn(gameBoard, availableSpots);
                        }
                    } else {
                        player2Turn(CreateBoard.board, CreateBoard.availableSpots);
                    }
                    player1Turn(CreateBoard.board, CreateBoard.availableSpots);
                }
            } catch (Exception e) {
                System.out.println("Please pick a valid input");
                player2Turn(CreateBoard.board, CreateBoard.availableSpots);
            }
        }
    }

