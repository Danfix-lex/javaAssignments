public class MultiplicationTable {
    public static void main(String[] args) {
        for (int number = 1; number <= 9; number++) {
            for (int multiplication = 1; multiplication <= 9; multiplication++) {
                System.out.print(number + " * " + multiplication + " = " + (number * multiplication) + "  ");
            }
            System.out.println();
        }
    }
}

