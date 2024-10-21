import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number between 1 and 30: ");
            int num = scanner.nextInt();

            if (num < 1 || num > 30) {
                System.out.print("Invalid input. Exiting.");
                break;
            }

            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }

