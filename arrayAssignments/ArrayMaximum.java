import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) array[i] = scanner.nextInt();

        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) max = array[i];
        }

        System.out.println("Maximum element: " + max);
    }
}

