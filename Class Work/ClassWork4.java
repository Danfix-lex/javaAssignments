import java.util.Scanner;

  public class ClassWork4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Number of Days of the week: ");
        
        int days_of_week = input.nextInt();
      
      switch (days_of_week) {  
      
        case 1 ->
          System.out.println("Monday");
        case 2 ->
          System.out.println("Tuesday");
        case 3 ->
          System.out.println("Wednesday");
        case 4 ->
          System.out.println("Thursday");
        case 5 ->
          System.out.println("Friday");
        case 6 ->
          System.out.println("Saturday");
        case 7 ->
          System.out.println("Sunday");
        default ->
          System.out.println("Sorry start again and enter a valid number of either 1 to 7");
  }
}
}
