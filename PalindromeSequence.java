import java.util.Scanner;

public class PalindromeSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter five digits: ");
        String number = input.nextLine();
              
        int reversed = 0;
        int original = 0;
        
        if (number.length() == 5) {
            int numbers = Integer.parseInt(number);
            
            original = numbers;
            
            while (numbers > 0) {
            int digit = numbers % 10;
            reversed = reversed * 10 + digit;
            numbers = numbers/ 10;
        }

            if (original == reversed) {
            System.out.println(original + " is a palindrome");
        }
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}    
