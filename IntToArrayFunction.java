import java.util.ArrayList;

public class IntToArrayFunction {
    public static void main(String[] args) {
        int[] primes = primeNumbersToArray(19);

        System.out.print("Prime numbers: ");
        for (int prime : primes) {
            System.out.printf(prime + " ");
        }
    }

    public static int[] primeNumbersToArray(int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        int[] primeArray = new int[primeNumbers.size()];
        for (int m = 0; m < primeNumbers.size(); m++) {
            primeArray[m] = primeNumbers.get(m);
        }

        return primeArray;
    }
}

