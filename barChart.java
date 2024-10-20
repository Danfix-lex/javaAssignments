import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            int num = scanner.nextInt();
            while (num < 1 || num > 30) {
                System.out.print("Invalid input. Enter a number between 1 and 30: ");
                num = scanner.nextInt();
            }
            numbers[i] = num;
        }

        for (int num : numbers) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
