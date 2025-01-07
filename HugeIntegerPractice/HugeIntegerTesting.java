import java.util.Scanner;

public class HugeIntegerTesting {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
        // Step 1: Declare an array to hold 40 huge integers
        String[] hugeIntegers = new String[40];
        
        // Step 2: Initialize each element with a 40-digit number
        for (int i = 0; i < hugeIntegers.length; i++) {
        	System.out.print("Enter 40 digits: ");
            // Generate a 40-digit number as a string
            hugeIntegers[i] = input.nextLine();
        }
        int[][] numbers = new int[40][40];
        
        // Step 2: Extract each digit and store it into the 2D array
        for (int i = 0; i < 40; i++) { // Loop through 40 numbers
            for (int j = 0; j < 40; j++) { // Extract 40 digits for each number
                int index = i * 40 + j; // Calculate the position in the string
                numbers[i][j] = hugeIntegers.charAt(index) - '0'; // Convert char to int
            }
        }
    }
}
    
    
