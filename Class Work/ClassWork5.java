import java.util.Scanner;

  public class ClassWork5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Welcome player, enter the number of your rank: ");
        
        int rank = input.nextInt();
      
      switch (rank) {  
      
        case 1 ->
          System.out.println("Gold Medal");
        case 2 ->
          System.out.println("Silver Medal");
        case 3 ->
          System.out.println("Bronze Medal");
        case 4 ->
          System.out.println("Participant Ribbon");
        default ->
          System.out.println("Well done player, do better in next competition");
  }
}
}
