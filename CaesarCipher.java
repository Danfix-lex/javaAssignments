import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Encryption\n2. Decryption\nChoose either (1 or 2): ");
        int choice = input.nextInt();

        System.out.println("Message can only be lower or upper case");
        System.out.print("Enter Message: ");
        String message = input.nextLine();

        System.out.print("Enter key (0-25): ");
        int shift = input.nextInt();

        if (choice == 1) {
            String encryptedMessage = encryptMessage(message, shift);
            System.out.println("Encrypted Message: " + encryptedMessage);
        } else if (choice == 2) {
            String decryptedMessage = decryptMessage(message, shift);
            System.out.println("Decrypted Message: " + decryptedMessage);
        } else {
            System.out.println("Please choose 1 for encryption or 2 for decryption.");
        }
    }

    public static String encryptMessage(String message, int shift) {
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                char base = 'a'
                if (Character.isLowerCase(c)) {
                      base = 'a'; 
                } else {
                        base = 'A'; 
                }
                char encryptedChar = (char) ((c - base + shift) % 26 + base);
                encryptedMessage += encryptedChar;
            } else {
                encryptedMessage += c;
            }
        }
        return encryptedMessage;
    }

    public static String decryptMessage(String message, int shift) {
        String decryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                char base = 'a'
                if (Character.isLowerCase(c)) {
                      base = 'a'; 
                } else {
                        base = 'A'; 
                }
                char decryptedChar = (char) ((c - base - shift + 26) % 26 + base);
                decryptedMessage += decryptedChar;
            } else {
                decryptedMessage += c;
            }
        }
        return decryptedMessage;
    }
}
