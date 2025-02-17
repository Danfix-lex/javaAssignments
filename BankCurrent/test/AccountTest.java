import AccountFunction.AccountFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    public AccountTest() {
    }

    @Test
    public void testIfAccountExist() {
        String pin = "1234";
        String name = "Daniel Ojo";
        AccountFunction bank = new AccountFunction(pin, name);
        Assertions.assertTrue(bank.itExist());
    }

    @Test
    public void testIfAccountDoesNotExist() {
        String pin = "1234";
        String name = "Daniel Ojo";
        AccountFunction bank = new AccountFunction(pin, name);
        Assertions.assertFalse(bank.doesNotExist());
    }

    @Test
    public void testForDepositAmount() {
        String pin = "1234";
        String name = "Daniel Ojo";
        AccountFunction bank = new AccountFunction(pin, name);
        int depositAmount = 100000;
        bank.deposit(depositAmount);
        Assertions.assertEquals(100000, bank.getBalance());
    }

    @Test
    public void testForOtherDepositAmount() {
        String pin = "1234";
        String name = "Daniel Ojo";
        AccountFunction bank = new AccountFunction(pin, name);
        int depositAmount = 100;
        bank.deposit(depositAmount);
        Assertions.assertEquals(100, bank.getBalance());
    }

    @Test
    public void testForWithdrawAmount() {
        String pin = "1234";
        String name = "Daniel Ojo";
        AccountFunction bank = new AccountFunction(pin, name);
        bank.deposit(100000);
        int withdrawAmount = 50000;
        String userPin = "1234";
        int newBalance = bank.withdraw(withdrawAmount, userPin);
        Assertions.assertEquals(50000, bank.getBalance());
        Assertions.assertEquals(50000, newBalance);
    }

    @Test
    public void testForBalanceCheck() {
        String pin = "1234";
        String name = "Daniel Ojo";
        AccountFunction bank = new AccountFunction(pin, name);
        int depositAmount = 100000;
        bank.deposit(depositAmount);
        Assertions.assertEquals(100000, bank.getBalance());
    }

    @Test
    public void testForToChangePin() {
        String pin = "1234";
        String name = "Daniel Ojo";
        AccountFunction bank = new AccountFunction(pin, name);
        String userPin = "1234";
        String newPin = "5678";
        boolean isUpdated = bank.updatePin(userPin, newPin);
        Assertions.assertTrue(isUpdated);
    }
}