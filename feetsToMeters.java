import java.util.Scanner;
/**
 * The feetsToMeters class converts feet to meters.
 */
public class feetsToMeters {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the number of feet
        System.out.print("Enter number of feet to be converted to meters: ");
        double feet = input.nextInt(); // Read user input for feet
        
        // Convert feet to meters using the conversion factor
        double meters = feet * 0.305;
        
        // Display the result in meters
        System.out.println("Meters: " + meters); // Output the converted value       
    }
}
