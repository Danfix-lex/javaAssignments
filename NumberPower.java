import java.util.Scanner;

public class NumberPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double numOne = scanner.nextDouble();
        System.out.print("Enter second number: ");
        int numTwo = scanner.nextInt();
        double result = 1;
        for (int i = 0; i < numTwo; i++) {
            result *= numOne;
        }
        System.out.println(result);
        scanner.close();
    }
}
