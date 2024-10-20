public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            int num = scanner.nextInt();
            while (num < 1) {
                System.out.print("Invalid input. Try again: ");
                num = scanner.nextInt();
            }
            while (num > 30) {
                System.out.print("Invalid input. Try again: ");
                num = scanner.nextInt();
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

