import java.util.Scanner;
public class CreditCardFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        long cardNumber = scanner.nextLong();

        int length = getCardLength(cardNumber);
        int[] digitSums = calculateSums(cardNumber, length);
        int firstDigit = getFirstDigit(cardNumber);
        int secondDigit = getSecondDigit(cardNumber);
        String cardType = getCardType(firstDigit, secondDigit);
        boolean isValidLength = validateLength(length);
        boolean isValidCard = validateCard(digitSums);

        System.out.println("Card Type: " + cardType);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Digit Length: " + length);
        System.out.println("Card Validity: " + (isValidCard && isValidLength ? "Valid" : "Invalid"));
    }

    public static int getCardLength(long number) {
        int length = 0;
        while (number > 0) {
            length++;
            number /= 10;
        }
        return length;
    }

    public static int[] calculateSums(long number, int length) {
        int sum1 = 0, sum2 = 0, position = 0;
        while (number > 0) {
            int digit = (int) (number % 10);
            position++;
            if (position % 2 == 0) {
                sum2 += digit;
            } else {
                sum1 += digit;
            }
            number /= 10;
        }
        return new int[]{sum1, sum2};
    }

    public static int getFirstDigit(long number) {
        while (number >= 10) {
            number /= 10;
        }
        return (int) number;
    }

    public static int getSecondDigit(long number) {
        while (number >= 100) {
            number /= 10;
        }
        return (int) (number % 10);
    }

    public static String getCardType(int firstDigit, int secondDigit) {
        if (firstDigit == 4) {
            return "Visa Card";
        } else if (firstDigit == 5) {
            return "MasterCard";
        } else if (firstDigit == 3 && secondDigit == 7) {
            return "American Express Card";
        } else if (firstDigit == 6) {
            return "Discover Card";
        } else {
            return "Invalid Card";
        }
    }

    public static boolean validateLength(int length) {
        return length > 12 && length <= 16;
    }

    public static boolean validateCard(int[] sums) {
        return (sums[0] + sums[1]) % 10 == 0;
    }
}
