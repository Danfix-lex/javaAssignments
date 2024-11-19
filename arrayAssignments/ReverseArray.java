import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) array[i] = scanner.nextInt();

        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }

        System.out.println("Reversed array:");
        for (int num : array) System.out.print(num + " ");
    }
}

