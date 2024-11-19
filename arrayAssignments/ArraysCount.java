import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[50];

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            if (num >= 1 && num <= 50) counts[num - 1]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                if (counts[i] == 1) {
                    System.out.println((i + 1) + " occurs " + counts[i] + " time");
                } else {
                    System.out.println((i + 1) + " occurs " + counts[i] + " times");
                }
            }
        }
    }
}

