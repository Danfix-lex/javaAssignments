import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
        int x = input.nextInt();
    System.out.println("Enter second number: ");
        int y = input.nextInt();
    System.out.println("Enter third number: ");
        int p = input.nextInt();
        int first = (x + p - 1) / p * p;
        int second = y / p * p;
        int third = (first - second) / p + 1;
        System.out.println(third);
    }
}

