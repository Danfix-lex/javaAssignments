public class Tasks {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.println(i);
                }
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                int result = i;
                for (int j = 1; j <= 5; j++) {
                    System.out.println(result);
                    result *= 2;
                }
            }
        }

        int totalSum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                int result = i;
                for (int j = 1; j <= 5; j++) {
                    totalSum += result;
                    result *= 2;
                }
            }
        }
        System.out.println("Sum of pairs: " + totalSum);

        int totalPairsSum = totalSum * 2;
        System.out.println("Sum of pairs again: " + totalPairsSum);

        long square = (long) totalSum * totalSum;
        System.out.println("Square of result: " + square);
    }
}

