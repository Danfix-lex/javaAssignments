import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first integer: ");
        int firstNumber = input.nextInt();
        
        System.out.print("Enter your second integer: ");
        int secondNumber = input.nextInt();
        
        switch(answer)
        
        System.out.println("Enter your answer to determine which operation was used to calculate it: ");
        float answer = input.nextFloat();
        
        int calculatedNumbersOne = firstNumber + secondNumber;
        int calculatedNumbersTwo = firstNumber - secondNumber;
        int calculatedNumbersThree = firstNumber * secondNumber;
        float calculatedNumbersFour = firstNumber / secondNumber;
        float calculatedNumbersFive = firstNumber % secondNumber;
        
        if (firstNumber + secondNumber == answer) {
          System.out.println("This was an addition calculation made, the answer is: " + calculatedNumbersOne);
        } else if (firstNumber - secondNumber == answer) {
            System.out.println("This was a subtraction calculation made, the answer is: " + calculatedNumbersTwo);
          } else if (firstNumber * secondNumber == answer) {
              System.out.println("This was a multiplication calculation made, the answer is: " + calculatedNumbersThree);
            } else if (firstNumber / secondNumber == answer) {
                System.out.println("This was a division calculation made, the answer is: " + calculatedNumbersFour);
              } else if (firstNumber % secondNumber == answer) {
                  System.out.println("This was a modulus division made, the answer is: " + calculatedNumbersFive);
    }        
  }
}
