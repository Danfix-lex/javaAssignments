import java.util.Scanner;

public class NokiaPhoneReturn {
    static Scanner nokia = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
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
                case 1: call(); break;
                case 2: message(); break;
                case 3: contactList(); break;
                case 4: settings(); break;
                case 5: clock(); break;
                case 6: chat(); break;
                case 7: callRegister(); break;
                case 8: games(); break;
                case 9: tones(); break;
                case 10: exit(); break;
                default: invalidOption(); break;
            }
        }
    }

    public static void call() {
        System.out.println("Dialing number!!!");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }

    public static void message() {
        System.out.println("Enter your message:");
        nokia.nextLine();
        String phoneMessage = nokia.nextLine();
        System.out.println("Please wait, sending message: " + phoneMessage);

        System.out.println("Message settings:");
        System.out.println("1. Set 1");
        System.out.println("2. Common");
        System.out.println("0. Back to Main Menu");

        int messageSettings = nokia.nextInt();
        nokia.nextLine();

        switch (messageSettings) {
            case 1:
                System.out.println("Set 1:");
                System.out.println("1. Message center number");
                System.out.println("2. Message sent as");
                System.out.println("3. Message validity");
                break;
            case 2:
                System.out.println("Common:");
                System.out.println("1. Delivery reports");
                System.out.println("2. Reply via same center");
                System.out.println("3. Character support");
                System.out.println("4. Info service");
                System.out.println("5. Voice mailbox number");
                System.out.println("6. Service command editor");
                break;
            case 0: return;  
            default: invalidOption(); break;
        }
    }

    public static void contactList() {
        System.out.println("My Contact List:");
        System.out.println("1. Sensie");
        System.out.println("2. Fame");
        System.out.println("3. Temi");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }

    public static void settings() {
        System.out.println("Settings Menu:");
        System.out.println("1. Change ringtone");
        System.out.println("2. Adjust brightness");
        System.out.println("3. Language settings");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }

    public static void clock() {
        System.out.println("Clock:");
        System.out.println("1. Check time");
        System.out.println("2. Adjust time");
        System.out.println("3. Create Alarm");
        System.out.println("4. Stopwatch");
        System.out.println("5. Auto update of date and time");
        System.out.println("6. Countdown timer");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }

    public static void chat() {
        System.out.println("Chat:");
        System.out.println("1. e-Message");
        System.out.println("2. Message");
        System.out.println("3. Facebook");
        System.out.println("4. 2Go");
        System.out.println("5. Ebuddy");
        System.out.println("6. Opera-mini");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }

    public static void callRegister() {
        System.out.println("Call register:");
        System.out.println("1. Missed calls");
        System.out.println("2. Received calls");
        System.out.println("3. Dialled numbers");
        System.out.println("4. Erase recent call lists");
        System.out.println("5. Show call duration");
        System.out.println("6. Show call costs");
        System.out.println("7. Call cost settings");
        System.out.println("8. Prepaid client");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }

    public static void games() {
        System.out.println("Games:");
        System.out.println("1. Snake");
        System.out.println("2. Ludo");
        System.out.println("3. Sudoku");
        System.out.println("4. Bounce");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }

    public static void tones() {
        System.out.println("Tones:");
        System.out.println("1. Ringing tone");
        System.out.println("2. Ringing volume");
        System.out.println("3. Incoming call alert");
        System.out.println("4. Composer");
        System.out.println("5. Message alert tone");
        System.out.println("6. Keypad tones");
        System.out.println("7. Warning and games tones");
        System.out.println("8. Vibrating alert");
        System.out.println("9. Screen saver");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  // Return to main menu
        }
    }

    public static void exit() {
        System.out.println("Exiting...");
        System.exit(0);
    }

    public static void invalidOption() {
        System.out.println("Invalid option");
    }
}

