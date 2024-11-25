import java.util.Scanner;

public class PositiveIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        int number = 0;
        int numberSum = 0;
        
        while (number < 10) {
            System.out.print("Enter positive integer: ");
            int collectedInput = input.nextInt();
            if (collectedInput > 0) {
                numberSum += collectedInput;
                number++;
            }
        }
        System.out.println("This is the sum of all the positive numbers: " + numberSum);
    }
}

