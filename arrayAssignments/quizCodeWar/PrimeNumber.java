import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your integer: ");
        int number = input.nextInt();
        
        int firstNumber = number / number;
        int secondNumber = number % 2;
        
        if (firstNumber == 1 && secondNumber == 1) System.out.println(number + " is a prime number");
          
        
        
  }
}
