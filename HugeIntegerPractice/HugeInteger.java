public class HugeInteger {
    private int[] digits;  // Array to store each digit of the huge number

    // Constructor: Accepts a number as a string and stores it in an array
    public HugeInteger(String number) {
        int n = number.length();
        digits = new int[n];  // Create an array to store digits
        for (int i = 0; i < n; i++) {
            digits[i] = number.charAt(i) - '0';  // Convert each character to an integer
        }
    }

    // Method to add two HugeInteger numbers
    public HugeInteger add(HugeInteger other) {
        int maxLength = Math.max(this.digits.length, other.digits.length);
        int[] result = new int[maxLength + 1];  // Create a result array (1 extra space for carry)

        int carry = 0;  // To store carry during addition

        // Add digits from right to left
        for (int i = 0; i < result.length; i++) {
            int digit1 = (this.digits.length - 1 - i >= 0) ? this.digits[this.digits.length - 1 - i] : 0;  // From this number
            int digit2 = (other.digits.length - 1 - i >= 0) ? other.digits[other.digits.length - 1 - i] : 0;  // From other number

            int sum = digit1 + digit2 + carry;  // Add digits and carry
            result[result.length - 1 - i] = sum % 10;  // Store last digit of the sum
            carry = sum / 10;  // Calculate the new carry
        }

        // If there's a leading zero in the result, remove it
        if (result[0] == 0) {
            int[] finalResult = new int[result.length - 1];
            System.arraycopy(result, 1, finalResult, 0, finalResult.length);
            return new HugeInteger(finalResult);
        } else {
            return new HugeInteger(result);
        }
    }

    // Private constructor to accept an array of digits
    private HugeInteger(int[] digits) {
        this.digits = digits;
    }

    // Method to print the number
    public void print() {
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
    }
}

