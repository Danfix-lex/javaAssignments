import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 10;
        int guess;

        do {
            System.out.print("Guess the number between 1 and 10: ");
            guess = input.nextInt();

            if (guess > answer) {
                System.out.println("Too high, try again.");
            } else if (guess < answer) {
                System.out.println("Too low, try again.");
            }
        } while (guess != answer);

        System.out.println("Congratulations! You guessed it right!!!");
    }
}

