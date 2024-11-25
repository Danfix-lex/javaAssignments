public class ArrayLoopFunctions {
    public static void main(String[] args) {
        forLoopArraySum(new int[]{1, 2, 3, 4, 5});
        whileLoopArraySum(new int[]{1, 2, 3, 4, 5});
        doWhileLoopArraySum(new int[]{1, 2, 3, 4, 5});
    }

    public static int forLoopArraySum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int whileLoopArraySum(int[] numbers) {
        int sum = 0, i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        return sum;
    }

    public static int doWhileLoopArraySum(int[] numbers) {
        int sum = 0, i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        return sum;
    }
}

