import java.util.Scanner;

public class NokiaPhone {
    static Scanner nokia = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println("Welcome to your Nokia Phone!");
        System.out.println("To start please Select an option:");
        System.out.println("1. Call");
        System.out.println("2. Message");
        System.out.println("3. Contact List");
        System.out.println("4. Settings");
        System.out.println("5. Clock");
        System.out.println("6. Chat");
        System.out.println("7. Call Register");
        System.out.println("8. Games");
        System.out.println("9. Tones");
        System.out.println("10. Exit");

        int menu = nokia.nextInt();
        nokia.nextLine();

        switch (menu) {
            case 1 -> call();
            case 2 -> message();
            case 3 -> contactList();
            case 4 -> settings();
            case 5 -> clock();
            case 6 -> chat();
            case 7 -> callRegister();
            case 8 -> games();
            case 9 -> tones();
            case 10 -> exit();
            default -> invalidOption();
        }
    }

    public static void call() {
        System.out.println("Dialing number!!!");
        System.out.println("0. Back to Main Menu");

        int option = nokia.nextInt();
        if (option == 0) mainMenu();
    }

    public static void message() {
        System.out.println("Enter your message:");
        nokia.nextLine(); // Consume newline left-over
        String phoneMessage = nokia.nextLine();
        System.out.println("Please wait, sending message: " + phoneMessage);

        System.out.println("Message settings:");
        System.out.println("1. Set 1");
        System.out.println("2. Common");
        System.out.println("0. Back to Main Menu");

        int messageSettings = nokia.nextInt();

        switch (messageSettings) {
            case 1 -> {
                System.out.println("Set 1:");
                System.out.println("1. Message center number");
                System.out.println("2. Message sent as");
                System.out.println("3. Message validity");
            }
            case 2 -> {
                System.out.println("Common:");
                System.out.println("1. Delivery reports");
                System.out.println("2. Reply via same center");
                System.out.println("3. Character support");
                System.out.println("4. Info service");
                System.out.println("5. Voice mailbox number");
                System.out.println("6. Service command editor");
            }
            case 0 -> mainMenu();
            default -> invalidOption();
        }
        mainMenu();
    }

    public static void contactList() {
        System.out.println("My Contact List:");
        System.out.println("1. Sensie");
        System.out.println("2. Fame");
        System.out.println("3. Temi");
        System.out.println("0. Back to Main Menu");

        int option = nokia.nextInt();
        if (option == 0) mainMenu();
        else mainMenu();
    }
}


