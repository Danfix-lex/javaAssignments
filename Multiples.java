import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        int tripleNum1 = num1 * 3;
        
        int doubleNum2 = num2 * 2;
        
        if (tripleNum1 % doubleNum2 == 0) {
            System.out.println("Yes you are correct: , " + tripleNum1 + " is a multiple of " + doubleNum2);
        } else {
            System.out.println("No give it another try!!! , " + tripleNum1 + " is not a multiple of " + doubleNum2);
        }
        
    }
}
