import java.util.Scanner;

  public class Comparator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int comparator = 0;
    
    System.out.println("Enter first number: ");
    int numberOne = input.nextInt();
    
    System.out.println("Enter Second Number: ");
    int numberTwo = input.nextInt();
    
    if (numberOne == numberTwo)
      System.out.println("The comparator is: " + comparator);
    
    else if (numberOne > numberTwo)
      System.out.println("The comparator is: " + 1);
        
    else {
      System.out.println("The comparator is:" + -1);
      }
      }
}
    
