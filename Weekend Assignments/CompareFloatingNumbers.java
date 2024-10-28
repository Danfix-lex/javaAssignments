import java.util.Scanner;

public class CompareFloatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first floating number: ");
        float numberOne = scanner.nextFloat();
        System.out.print("Enter second floating number: ");
        float numberTwo = scanner.nextFloat();
        int roundedNumberOne = (int)(numberOne * 1000);
        int roundedNumberTwo = (int)(numberTwo * 1000);
        if (roundedNumberOne == roundedNumberTwo) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}

