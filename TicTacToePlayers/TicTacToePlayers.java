import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToePlayers {

    static ArrayList<Integer> playerMovement = new ArrayList<Integer>();
    static ArrayList<Integer> computerMovement = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your input Player one (1-9): ");

            int userInput = input.nextInt();

            while (playerMovement.contains(userInput) || computerMovement.contains(userInput)) {
                System.out.println("movement taken! please enter another movement Player!!!");
                userInput = input.nextInt();
            }

            designPiece(gameBoard, userInput, "player");

           System.out.print("Enter your input Player two (1-9): ");
            int computerInput = input.nextInt();
            while (playerMovement.contains(computerInput) || computerMovement.contains(computerInput)) {
                computerInput = input.nextInt();
            }

            designPiece(gameBoard, computerInput, "computer");
            printGameBoard(gameBoard);

            String result = checkWinner();
            if (!result.equals("")) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void designPiece(char[][] gameBoard, int userInput, String user) {
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerMovement.add(userInput);
        } else if (user.equals("computer")) {
            symbol = 'O';
            computerMovement.add(userInput);
        }

        switch (userInput) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {
        List<Integer> upRow = Arrays.asList(1, 2, 3);
        List<Integer> middleRow = Arrays.asList(4, 5, 6);
        List<Integer> downRow = Arrays.asList(7, 8, 9);
        List<Integer> leftColumn = Arrays.asList(1, 4, 7);
        List<Integer> middleColumn = Arrays.asList(2, 5, 8);
        List<Integer> rightColumn = Arrays.asList(3, 6, 9);
        List<Integer> firstCross = Arrays.asList(1, 5, 9);
        List<Integer> secondCross = Arrays.asList(3, 5, 7);

        List<List<Integer>> winning = new ArrayList<List<Integer>>();
        winning.add(upRow);
        winning.add(middleRow);
        winning.add(downRow);
        winning.add(leftColumn);
        winning.add(middleColumn);
        winning.add(rightColumn);
        winning.add(firstCross);
        winning.add(secondCross);

        for (List<Integer> l : winning) {
            if (playerMovement.containsAll(l)) {
                return "Congratulations Player one won the game!";
            } else if (computerMovement.containsAll(l)) {
                return "Congratulations Player two won the game!";
            } else if (playerMovement.size() + computerMovement.size() == 9) {
                return "Good the game is a draw!";
            }
        }
        return "";
    }
}

