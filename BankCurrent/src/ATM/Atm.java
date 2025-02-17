package ATM;

import BankFunction.BankFunction;
import javax.swing.*;

public class Atm {
    private BankFunction bank;

    public Atm() {
        this.bank = new BankFunction();
    }

    public void atmMenu() {
        while (true) {
            String optionStr = JOptionPane.showInputDialog(null,
                    "Welcome to the ATM\n" +
                            "1. Create Account\n" +
                            "2. Deposit\n" +
                            "3. Withdraw\n" +
                            "4. Transfer\n" +
                            "5. Check Balance\n" +
                            "6. Close Account\n" +
                            "7. Exit\n" +
                            "Select an option:");

            try {
                int option = Integer.parseInt(optionStr);
                processOption(option);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                createAccount();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                transfer();
                break;
            case 5:
                checkBalance();
                break;
            case 6:
                closeAccount();
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
        }
    }

    private void createAccount() {
        try {
            int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number (1 or 2):"));
            String pin = JOptionPane.showInputDialog("Enter PIN:");
            String name = JOptionPane.showInputDialog("Enter Name:");
            bank.createAccount(pin, accountNumber, name);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    private void deposit() {
        try {
            int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number:"));
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to deposit:"));
            bank.deposit(amount, accountNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    private void withdraw() {
        try {
            int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number:"));
            String pin = JOptionPane.showInputDialog("Enter PIN:");
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to withdraw:"));
            bank.withdraw(amount, pin, accountNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    private void transfer() {
        try {
            int fromAccount = Integer.parseInt(JOptionPane.showInputDialog("Enter sender account number:"));
            int toAccount = Integer.parseInt(JOptionPane.showInputDialog("Enter receiver account number:"));
            String pin = JOptionPane.showInputDialog("Enter PIN:");
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to transfer:"));
            bank.transfer(amount, pin, fromAccount, toAccount);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    private void checkBalance() {
        try {
            int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number:"));
            if (bank.getAccount(accountNumber) != null) {
                JOptionPane.showMessageDialog(null, "Your balance is: " + bank.getAccount(accountNumber).getBalance());
            } else {
                JOptionPane.showMessageDialog(null, "Account does not exist.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    private void closeAccount() {
        try {
            int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter account number to close:"));
            bank.closeAccount(accountNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.atmMenu();
    }
}