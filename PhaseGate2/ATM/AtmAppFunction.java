public class AtmAppFunction {

    static final int numAccounts = 4;
    static String[] userNames = new String[numAccounts];
    static String[] userPins = new String[numAccounts];
    static String[] userDateOfBirths = new String[numAccounts];
    static double[] accountBalances = new double[numAccounts];


    
    public static String createAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            userNames[i] = "User" + (i + 1);
            userPins[i] = "1234";
            userDateOfBirths[i] = "01-01-2000";
            accountBalances[i] = 0.0;
        }
        return "Accounts created successfully.";
    }



    
    public static int authenticateUser(String enteredPin) {
        for (int i = 0; i < userPins.length; i++) {
            if (enteredPin.equals(userPins[i])) {
                return i;
            }
        }
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
    }

    static boolean processChoice(int choice, int accountIndex) {
        switch (choice) {
            case 1:
                System.out.println("Your current balance is: " + getAccountBalance(accountIndex));
                break;
            case 2:
                double depositAmount = depositMoney(accountIndex, 100.0);
                System.out.println("Deposited: " + depositAmount);
                break;
            case 3:
                double withdrawnAmount = withdrawMoney(accountIndex, 50.0);
                if (withdrawnAmount > 0) {
                    System.out.println("Withdrawn: " + withdrawnAmount);
                } else {
                    System.out.println("Insufficient funds or invalid amount.");
                }
                break;
            case 4:
                double transferredAmount = transferMoney(accountIndex, 30.0); 
                if (transferredAmount > 0) {
                    System.out.println("Transferred: " + transferredAmount);
                } else {
                    System.out.println("Transfer failed.");
                }
                break;
            case 5:
                String changePinResult = changePin(accountIndex, "4321"); 
                System.out.println(changePinResult);
                break;
            case 6:
                System.out.println("Exiting the ATM system. Goodbye!");
                return false;
            default:
                System.out.println("Invalid option. Try again.");
        }
        return true;
    }



    
    public static double depositMoney(int accountIndex, double depositAmount) {
        accountBalances[accountIndex] += depositAmount;
        return depositAmount;
    }



    
    public static double withdrawMoney(int accountIndex, double withdrawAmount) {
        if (withdrawAmount > accountBalances[accountIndex] || withdrawAmount <= 0) {
            return -1;
        } else {
            accountBalances[accountIndex] -= withdrawAmount;
            return withdrawAmount;
        }
    }



    
    public static double transferMoney(int accountIndex, double transferAmount) {
        if (transferAmount <= 0 || transferAmount > accountBalances[accountIndex]) {
            return -1;
        } else {
            accountBalances[accountIndex] -= transferAmount;
            return transferAmount;
        }
    }



    
    public static String changePin(int accountIndex, String newPin) {
        userPins[accountIndex] = newPin;
        return "Pin changed successfully.";
    }



    
    public static double getAccountBalance(int accountIndex) {
        return accountBalances[accountIndex];
    }



    
    public static void main(String[] args) {
        createAccounts();

        int accountIndex = authenticateUser("1234"); 
        if (accountIndex != -1) {
            int choice = 1;
            processChoice(choice, accountIndex);
        }
    }

}

