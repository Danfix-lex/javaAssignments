import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number between 1 and 30: ");
            int number = scanner.nextInt();

            if (number < 1 || number > 30) {
                System.out.print("Invalid input. Exiting.");
                break;
            }

            System.out.println("*".repeat(number));
            count++;
        }
    }
}

