import java.util.Scanner;

public class MultiplicationTableForFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter Multiplication: ");
        int multiplication = scanner.nextInt();
        System.out.println(number + " X 0 = " + (number * 0));
        System.out.println(number + " X 1 = " + (number * 1));
        System.out.println(number + " X 2 = " + (number * 2));
        System.out.println(number + " X 3 = " + (number * 3));
        System.out.println(number + " X 4 = " + (number * 4));
        System.out.println(number + " X 5 = " + (number * 5));
    }
}

