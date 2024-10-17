import java.util.Scanner;
/**
 * The negativePositiveAndZeroValues class counts the number of positive,
 * negative, and zero values entered by the user.
 */
public class negativePositiveAndZeroValues {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Initialize variable as counters for positive, negative, and zero values
        int positive = 0;
        int zero = 0;
        int negative = 0;
        
        int i = 0; // Loop counter
        
        // Loop to read 5 numbers from the user
        while (i < 5) {
            System.out.print("Enter your number: ");
            int num1 = input.nextInt(); // Read user input for the number
            
            // Check if the number is positive
            if (num1 > 0) {
                positive = positive + 1; // positive counter
            }
            // Check if the number is negative
            else if (num1 < 0) {
                negative = negative + 1; // negative counter
            }
            // The number is zero
            else {
                zero = zero + 1; // Increment zero counter
            }
            
            i++; // Increment loop counter
        }
        
        // Display the counts of positive, negative, and zero values
        System.out.println("\nPositive: " + positive + "\nNegative: " + negative + "\nZero: " + zero);
        
    }
}
