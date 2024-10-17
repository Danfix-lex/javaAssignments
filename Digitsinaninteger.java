import java.util.Scanner;
/**
 * The Digitsinaninteger class calculates the sum of the digits of an integer.
 */
public class Digitsinaninteger {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for a number between 0 and 1000
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt(); // Read user input for the number
        
        int sum = 0; // Initialize sum to 0
        
        // Loop to extract each digit and calculate the sum
        while (number > 0) {
            int lastDigit = number % 10; // Get the last digit
            sum = sum + lastDigit; // Add the last digit to sum
            number = number / 10; // Remove the last digit from the number
        }
        
        // Display the sum of the digits in an intger
        System.out.println("The sum of the digits is: " + sum);
        
    }
}
