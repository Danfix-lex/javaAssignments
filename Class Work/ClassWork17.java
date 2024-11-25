import java.util.Scanner;

  public class ClassWork17 {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      System.out.println("Enter Number: ");
      int number = input.nextInt();
     

      while (number != 0) { 
          
          int count = 0;
        
          if (number % 1 == 0 && number % 2 == 0 && number % 3 == 0) {
            count ++;             
            System.out.println("This is a perfect number: " + number);
        break;
            } else {
                System.out.println("This is not a perfect number: " + number);
        break;
          }       
    }
  }
}
