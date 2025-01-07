import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        String cardNumber = scanner.nextLine();

        String cardType = "";
        int length = cardNumber.length();

        if (cardNumber.startsWith("4")) {
            cardType = "Visa";
        } else if (cardNumber.startsWith("5")) {
            cardType = "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            cardType = "American Express";
        } else if (cardNumber.startsWith("6")) {
            cardType = "Discover";
        } else {
            cardType = "Unknown";
        }

        boolean isValidLength = length >= 12 && length <= 16;

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            if (i % 2 == 0) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
        }

        int totalSum = sum1 + sum2;

        boolean isValidCard = totalSum % 10 == 0;

        System.out.println("Card Type: " + cardType);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Digit Length: " + length);
        System.out.println("Card Validity: " + (isValidCard && isValidLength ? "Valid" : "Invalid"));
    }
}

