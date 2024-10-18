import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();
        boolean result = isPalindrome(number);

        if (result) {
            System.out.println(number + " is a palindrome!");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        
        return original == reversed;
    }
}
