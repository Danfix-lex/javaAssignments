import java.util.Scanner;

public class HugeIntegerCurrent {
	Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
        // Step 1: Declare an array to hold 40 huge integers
        String[] hugeIntegers = new String[40];
        
        // Step 2: Initialize each element with a 40-digit number
        for (int i = 0; i < hugeIntegers.length; i++) {
        	System.out.print("Enter 40 digits: ");
            // Generate a 40-digit number as a string
            hugeIntegers[i] = input.nextLine();
        }
        
    
    public static void main(String[] args) {
        // Example string: a concatenation of 40 elements, each with 40 digits
        String hugeNumbersString = generateExampleString();

        // Step 1: Create a 2D array to hold the 40 elements, each with 40 digits
        int[][] numbers = new int[40][40];
        
        // Step 2: Extract each digit and store it into the 2D array
        for (int i = 0; i < 40; i++) { // Loop through 40 numbers
            for (int j = 0; j < 40; j++) { // Extract 40 digits for each number
                int index = i * 40 + j; // Calculate the position in the string
                numbers[i][j] = hugeIntegers.charAt(index) - '0'; // Convert char to int
            }
        }
    
    
    

    
    
    int[][] digits;  // Array to store the number

    // Constructor: Accepts a number as a string and stores it in an array
    HugeInteger(String number) {
        digits = new int[number.length()];  // Make the array size equal to the number of digits
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';  // Store each digit as an integer
        }
    }

    // Method to add two HugeInteger numbers
    HugeInteger add(HugeInteger other) {
        int size1 = digits.length;           // Size of the first number
        int size2 = other.digits.length;     // Size of the second number
        int maxSize = (size1 > size2) ? size1 : size2;  // Find the bigger size
        int[] result = new int[maxSize + 1];  // Result array (1 extra for carry)

        int carry = 0;  // To keep track of the carry
        int i = size1 - 1;  // Start from the last digit of the first number
        int j = size2 - 1;  // Start from the last digit of the second number
        int k = result.length - 1;  // Start from the last position of the result array

        // Add the two numbers from right to left
        while (i >= 0 || j >= 0) {
            int digit1 = 0;
            if (i >= 0) {  // If there are still digits in the first number
                digit1 = digits[i];
                i--;  // Move to the next left digit
            }

            int digit2 = 0;
            if (j >= 0) {  // If there are still digits in the second number
                digit2 = other.digits[j];
                j--;  // Move to the next left digit
            }

            int sum = digit1 + digit2 + carry;  // Add the digits and the carry
            result[k] = sum % 10;  // Take the last digit of the sum
            carry = sum / 10;      // Find the carry for the next addition
            k--;  // Move to the next position in the result array
        }

        // If there is still a carry, store it in the first position
        if (carry > 0) {
            result[k] = carry;
        }

        // Create a new HugeInteger for the result
        HugeInteger finalResult = new HugeInteger(result);
        return finalResult;
    }

    // Constructor: Accepts an array of  digits (used for the result)
    HugeInteger(int[] resultDigits) {
        // If the first digit is 0, ignore it (leading zero)
        if (resultDigits[0] == 0) {
            digits = new int[resultDigits.length - 1];
            for (int i = 1; i < resultDigits.length; i++) {
                digits[i - 1] = resultDigits[i];
            }
        } else {
            digits = resultDigits;  // If no leading zero, store the whole array
        }
    }

    // Method to print the number
    void print() {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);  // Print each digit in the array
        }
        System.out.println();
    }
}
