package BankFunction;

import AccountFunction.AccountFunction;

public class BankFunction {
   private AccountFunction account1;
   private AccountFunction account2;

   public boolean createAccount(String pin, int accountNumber, String name) {
      if (accountNumber == 1 && this.account1 == null) {
         this.account1 = new AccountFunction(pin, name);
         return true;
      } else if (accountNumber == 2 && this.account2 == null) {
         this.account2 = new AccountFunction(pin, name);
         return true;
      } else {
         return false;
      }
   }

   public AccountFunction getAccount(int accountNumber) {
      if (accountNumber == 1) {
         return this.account1;
      } else {
         return accountNumber == 2 ? this.account2 : null;
      }
   }

   public boolean deposit(int amount, int accountNumber) {
      AccountFunction account = this.getAccount(accountNumber);
      if (account != null) {
         account.deposit(amount);
         return true;
      } else {
         return false;
      }
   }

   public boolean withdraw(int amount, String pin, int accountNumber) {
      AccountFunction account = this.getAccount(accountNumber);
      if (account != null) {
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
         return true;
      } else {
         return false;
      }
   }

   public boolean closeAccount(int accountNumber) {
      if (accountNumber == 1 && this.account1 != null) {
         this.account1 = null;
         return true;
      } else if (accountNumber == 2 && this.account2 != null) {
         this.account2 = null;
         return true;
      } else {
         return false;
      }
   }
}
