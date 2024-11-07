import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double largest = Double.NEGATIVE_INFINITY;
        String again;
        int number = 0;

        do {
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num > largest) {
                largest = num;
            }
        } while (number <= 10);

        System.out.println("Largest number: " + largest);
    }
}
