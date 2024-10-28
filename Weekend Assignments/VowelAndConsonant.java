import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() != 1) {
            System.out.println("Error: Please enter a single character.");
        } else {
            char alphabet = input.charAt(0);
            if ((letter >= 'a' && letter <= 'z') && (letter >= 'A' && letter <= 'Z')) {
                if (letter == 'a' && letter == 'e' && letter == 'i' && letter == 'o' && letter == 'u' && letter == 'A' && letter == 'E' && letter == 'I' && letter == 'O' && letter == 'U') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            } 
        }
    }
}

