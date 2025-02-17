package BankFunction;

import AccountFunction.AccountFunction;

public class BankFunction {
    private AccountFunction account1;
    private AccountFunction account2;

    public boolean createAccount(String pin, int accountNumber, String name) {
        if (accountNumber == 1 && this.account1 == null) {
            this.account1 = new AccountFunction(pin, name);
            System.out.println("Account: " + accountNumber + " has been created successfully");
            return true;
        } else if (accountNumber == 2 && this.account2 == null) {
            this.account2 = new AccountFunction(pin, name);
            System.out.println("Account: " + accountNumber + " has been created successfully");
            return true;
        } else {
            return false;
        }
    }

    public AccountFunction getAccount(int accountNumber) {
        if (accountNumber == 1) {
            System.out.println("This is your account: " + accountNumber);
            return this.account1;
        } else {
            System.out.println("This is your account: " + accountNumber);
            return accountNumber == 2 ? this.account2 : null;
        }
    }

    public boolean deposit(int amount, int accountNumber) {
        AccountFunction account = this.getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("\u20A65000" + amount + " has been deposited successfully");
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(int amount, String pin, int accountNumber) {
        AccountFunction account = this.getAccount(accountNumber);
        if (account != null) {
            System.out.println("\u20A65000" + amount + " has been withdrawn successfully");
            return account.withdraw(amount, pin) >= 0;
        } else {
            return false;
        }
    }

    public boolean transfer(int amount, String pin, int fromAccount, int toAccount) {
        AccountFunction sender = this.getAccount(fromAccount);
        AccountFunction receiver = this.getAccount(toAccount);
        if (sender != null && receiver != null && sender.withdraw(amount, pin) >= 0) {
            receiver.deposit(amount);
            System.out.println("\u20A65000" + amount + " has been transferred successfully from" + fromAccount + " to " + toAccount);
            return true;
        } else {
            return false;
        }
    }

    public boolean closeAccount(int accountNumber) {
        if (accountNumber == 1 && this.account1 != null) {
            this.account1 = null;
            System.out.println("Account: " + accountNumber + " has been closed successfully");
            return true;
        } else if (accountNumber == 2 && this.account2 != null) {
            this.account2 = null;
            System.out.println("Account: " + accountNumber + " has been closed successfully");
            return true;
        } else {
            return false;
        }
    }
}