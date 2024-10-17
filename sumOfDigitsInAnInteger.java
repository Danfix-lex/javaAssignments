import java.util.Scanner;

public class sumOfDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();
        
        int sum = 0;
        
        while (number > 0) {
            int lastDigit = number % 10; 
            sum += lastDigit; 
            number = number / 10; 
        }
        
        System.out.println(sum);
        
    }
}
        
