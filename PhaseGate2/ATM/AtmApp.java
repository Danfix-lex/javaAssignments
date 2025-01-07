import java.util.Scanner;

public class AtmApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        User[] users = new User[1000000];
        int userCount = 0;
        String currentUserPin = null;
        User currentUser = null;

        while (true) {
            System.out.println("ATM Options:");
            System.out.println("1. Create a new account");
            System.out.println("2. Login to existing account");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    if (userCount < 10) {
                        System.out.print("Enter your full name: ");
                        String name = input.nextLine();
                        System.out.print("Enter your ATM pin: ");
                        String pin = input.nextLine();
                        users[userCount] = new User(name, pin);
                        userCount++;
                        System.out.println("Account created successfully!");
                    } else {
                        System.out.println("Sorry, maximum number of accounts reached.");
                    }
                    break;

                case 2:
                    System.out.print("Enter your ATM pin to login: ");
                    String loginPin = input.nextLine();
                    currentUser = findUserByPin(users, userCount, loginPin);
                    
                    if (currentUser != null) {
                        currentUserPin = currentUser.getPin();
                        System.out.println("Welcome " + currentUser.name + "!");
                        manageAccount(input, currentUser);
                    } else {
                        System.out.println("Invalid pin. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting ATM system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static User findUserByPin(User[] users, int userCount, String pin) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getPin().equals(pin)) {
                return users[i];
            }
        }
        return null;
    }

    private static void manageAccount(Scanner input, User currentUser) {
        while (true) {
            System.out.println("\nATM Operations:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check account balance");
            System.out.println("4. Change pin");
            System.out.println("5. Logout");

            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    currentUser.deposit(depositAmount);
                    System.out.println("Deposited: " + depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    if (currentUser.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawn: " + withdrawAmount);
                    } else {
                        System.out.println("Insufficient funds or invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current balance: " + currentUser.getAccountBalance());
                    break;

                case 4:
                    System.out.print("Enter your new pin: ");
                    String newPin = input.nextLine();
                    currentUser.changePin(newPin);
                    System.out.println("Pin changed successfully.");
                    break;

                case 5:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

