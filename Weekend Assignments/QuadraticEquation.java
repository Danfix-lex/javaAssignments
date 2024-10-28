import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double numberOne = input.nextDouble();
        System.out.print("Input b: ");
        double numberTwo = input.nextDouble();
        System.out.print("Input c: ");
        double numberThree = input.nextDouble();

        double calculation = numberTwo * numberTwo - 4 * numberOne * numberThree;
        double rootOne; 
        double rootTwo;

        if (calculation > 0) {
            rootOne = (-numberTwo + Math.sqrt(calculation)) / (2 * numberOne);
            rootTwo = (-numberTwo - Math.sqrt(calculation)) / (2 * numberOne);
            System.out.println("The roots are: " + rootOne + " and " + rootTwo);
        } else if (calculation == 0) {
            rootOne = -numberTwo / (2 * numberOne);
            System.out.println("The root is: " + rootOne);
        } else {
            System.out.println("The equation roots.");
        }
    }
}

