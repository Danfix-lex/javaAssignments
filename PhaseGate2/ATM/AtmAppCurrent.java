import java.util.Scanner;

public class AtmAppCurrent {

    static Scanner input = new Scanner(System.in);
    static final int numAccounts = 5;

    static String[] userNames = new String[numAccounts];
    static String[] userPins = new String[numAccounts];
    static String[] userDateOfBirths = new String[numAccounts];
    static double[] accountBalances = new double[numAccounts];

    public static void main(String[] args) {
        createAccounts();

        while (true) {
            int accountIndex = authenticateUser();
            if (accountIndex == -1) continue;

            while (true) {
                displayOptions();
                int choice = input.nextInt();
                input.nextLine();
                if (!processChoice(choice, accountIndex)) break;
            }
        }
    }

    public static void createAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Creating account for user " + (i + 1));

            System.out.print("Enter your full name: ");
            userNames[i] = input.nextLine();

            System.out.print("Create your ATM pin: ");
            userPins[i] = input.nextLine();

            System.out.print("Enter your Date-Of-Birth in this format (dd-mm-yyyy): ");
            userDateOfBirths[i] = input.nextLine();

            accountBalances[i] = 0.0;
            System.out.println("Account created successfully!\n");
        }
    }

    public static int authenticateUser() {
        System.out.print("Enter your ATM pin to continue: ");
        String enteredPin = input.nextLine();

        for (int i = 0; i < numAccounts; i++) {
            if (enteredPin.equals(userPins[i])) return i;
        }

        System.out.println("Incorrect pin. Try again.");
        return -1;
    }

    public static void displayOptions() {
        System.out.println("\nATM Options:");
        System.out.println("1. Check account balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Transfer money");
        System.out.println("5. Change pin");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    static boolean processChoice(int choice, int accountIndex) {
        switch (choice) {
            case 1:
                System.out.println("Your current balance is: " + accountBalances[accountIndex]);
                break;

            case 2:
                depositMoney(accountIndex);
                break;

            case 3:
                withdrawMoney(accountIndex);
                break;

            case 4:
                transferMoney(accountIndex);
                break;

            case 5:
                changePin(accountIndex);
                break;

            case 6:
                System.out.println("Exiting the ATM system. Goodbye!");
                return false;

            default:
                System.out.println("Invalid option. Try again.");
        }
        return true;
    }

    public static void depositMoney(int accountIndex) {
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        input.nextLine();
        accountBalances[accountIndex] += depositAmount;
        System.out.println("Deposited: " + depositAmount);
    }

    public static void withdrawMoney(int accountIndex) {
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        input.nextLine();
        if (withdrawAmount > accountBalances[accountIndex]) {
            System.out.println("Insufficient funds.");
        } else if (withdrawAmount > 0) {
            accountBalances[accountIndex] -= withdrawAmount;
            System.out.println("Withdrawn: " + withdrawAmount);
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    public static void transferMoney(int accountIndex) {
        System.out.print("Enter account number to transfer to (10 digits): ");
        String accountNumber = input.nextLine();
        if (accountNumber.length() != 10) {
            System.out.println("Account number must be 10 digits. Try again.");
            return;
        }

        System.out.print("Enter the amount to transfer: ");
        double transferAmount = input.nextDouble();
        input.nextLine();
        if (transferAmount <= 0) {
            System.out.println("Invalid amount. Try again.");
        } else if (transferAmount > accountBalances[accountIndex]) {
            System.out.println("Insufficient funds for transfer. Try again.");
        } else {
            accountBalances[accountIndex] -= transferAmount;
            System.out.println("Transferred: " + transferAmount);
        }
    }

    public static void changePin(int accountIndex) {
        System.out.print("Enter your current pin: ");
        String currentPin = input.nextLine();
        if (currentPin.equals(userPins[accountIndex])) {
            System.out.print("Enter your new pin: ");
            String newPin = input.nextLine();
            userPins[accountIndex] = newPin;
            System.out.println("Pin changed successfully.");
        } else {
            System.out.println("Incorrect pin. Try again.");
        }
    }
}

