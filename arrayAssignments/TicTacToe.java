public class TicTacToe {
  public static void main(String[] args) {
  
    String [][] gameBoard = {{"   ", " | ", "   ", " | ", "   "},
                {" __ ", "+ ", "__ ", " + ", "__ "},
                {"   ", " | ", "   ", " | ", "   "},
                {" __ ", "+ ", "__ ", " + ", "__ "},
                {"   ", " | ", "   ", " | ", "   "}};

      }
  public static void printGameBoard(String[][] gameBoard) {
    for(String[] row : gameBoard) {
      for (String game : row) {
          System.out.print(game);
        }
        System.out.println();
}
