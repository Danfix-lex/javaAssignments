import java.util.Scanner;

public class NextStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean allAbove50 = true;

        System.out.print("Enter integer 1: ");
        int number1 = scanner.nextInt();
        if (number1 < 50) allAbove50 = false;

        System.out.print("Enter integer 2: ");
        int number2 = scanner.nextInt();
        if (number2 < 50) allAbove50 = false;

        System.out.print("Enter integer 3: ");
        int number3 = scanner.nextInt();
        if (number3 < 50) allAbove50 = false;

        System.out.print("Enter integer 4: ");
        int number4 = scanner.nextInt();
        if (number4 < 50) allAbove50 = false;

        System.out.print("Enter integer 5: ");
        int number5 = scanner.nextInt();
        if (number5 < 50) allAbove50 = false;

        System.out.print("Enter integer 6: ");
        int number6 = scanner.nextInt();
        if (number6 < 50) allAbove50 = false;

        System.out.print("Enter integer 7: ");
        int number7 = scanner.nextInt();
        if (number7 < 50) allAbove50 = false;

        System.out.print("Enter integer 8: ");
        int number8 = scanner.nextInt();
        if (number8 < 50) allAbove50 = false;

        System.out.print("Enter integer 9: ");
        int number9 = scanner.nextInt();
        if (number9 < 50) allAbove50 = false;

        System.out.print("Enter integer 10: ");
        int number10 = scanner.nextInt();
        if (number10 < 50) allAbove50 = false;

        if (allAbove50 = true) {
            System.out.println("Congratulations! You all have been promoted to the next stage!");
        }
    }
}

