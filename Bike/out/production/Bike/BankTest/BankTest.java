package BankTest;

import BankFunction.BankFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTest {
   @Test
   public void testCreateAccount() {
      BankFunction bank = new BankFunction();
      Assertions.assertTrue(bank.createAccount("1234", 1, "Daniel Ojo"));
      Assertions.assertTrue(bank.createAccount("5678", 2, "Divine Boss"));
   }

   @Test
   public void testDeposit() {
      BankFunction bank = new BankFunction();
      bank.createAccount("1234", 1, "Daniel Ojo");
      Assertions.assertTrue(bank.deposit(1000, 1));
      Assertions.assertEquals(1000, bank.getAccount(1).getBalance());
   }

   @Test
   public void testWithdraw() {
      BankFunction bank = new BankFunction();
      bank.createAccount("1234", 1, "Daniel Ojo");
      bank.deposit(1000, 1);
      Assertions.assertTrue(bank.withdraw(500, "1234", 1));
      Assertions.assertEquals(500, bank.getAccount(1).getBalance());
   }

   @Test
   public void testTransfer() {
      BankFunction bank = new BankFunction();
      bank.createAccount("1234", 1, "Daniel Ojo");
      bank.createAccount("5678", 2, "Divine Boss");
      bank.deposit(1000, 1);
      Assertions.assertTrue(bank.transfer(500, "1234", 1, 2));
      Assertions.assertEquals(500, bank.getAccount(1).getBalance());
      Assertions.assertEquals(500, bank.getAccount(2).getBalance());
   }

   @Test
   public void testCloseAccount() {
      BankFunction bank = new BankFunction();
      bank.createAccount("1234", 1, "Daniel Ojo");
      Assertions.assertTrue(bank.closeAccount(1));
      Assertions.assertNull(bank.getAccount(1));
   }
}
