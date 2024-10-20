import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largest = Double.NEGATIVE_INFINITY;
        double smallest = Double.POSITIVE_INFINITY;
        String again;

        do {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            System.out.print("Do you want to enter another number? (yes/no): ");
            again = scanner.next();
        } while (again.equalsIgnoreCase("yes"));

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
