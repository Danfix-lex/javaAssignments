import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtmAppFunctionTest {

    @Test
    void testCreateAccounts() {
        assertEquals("Accounts created successfully.", AtmAppFunction.createAccounts());
        assertNotNull(AtmAppFunction.userNames[0]);
        assertNotNull(AtmAppFunction.userPins[0]);
        assertNotNull(AtmAppFunction.userDateOfBirths[0]);
        assertEquals(0.0, AtmAppFunction.accountBalances[0]);
    }

    @Test
    void testAuthenticateUser() {
        int accountIndex = AtmAppFunction.authenticateUser("1234");
        assertFalse(accountIndex >= 0);
    }

    @Test
    void testAuthenticateUserInvalidPin() {
        int accountIndex = AtmAppFunction.authenticateUser("9999");
        assertEquals(-1, accountIndex);
    }

    @Test
    void testDepositMoney() {
        double depositAmount = AtmAppFunction.depositMoney(0, 200.0);
        assertEquals(200.0, depositAmount);
        assertEquals(750.0, AtmAppFunction.getAccountBalance(0));
    }

    @Test
    void testWithdrawMoney() {
        AtmAppFunction.depositMoney(0, 300.0);
        double withdrawnAmount = AtmAppFunction.withdrawMoney(0, 100.0);
        assertEquals(100.0, withdrawnAmount);
        assertEquals(550.0, AtmAppFunction.getAccountBalance(0));
    }

    @Test
    void testWithdrawMoneyInsufficientFunds() {
        AtmAppFunction.depositMoney(0, 50.0);
        double withdrawnAmount = AtmAppFunction.withdrawMoney(0, -1.0);
        assertEquals(-1, withdrawnAmount);
        assertEquals(350.0, AtmAppFunction.getAccountBalance(0));
    }

    @Test
    void testTransferMoney() {
        AtmAppFunction.depositMoney(0, 500.0);
        double transferredAmount = AtmAppFunction.transferMoney(0, 200.0);
        assertEquals(200.0, transferredAmount);
        assertEquals(300.0, AtmAppFunction.getAccountBalance(0));
    }

    @Test
    void testTransferMoneyInsufficientFunds() {
        AtmAppFunction.depositMoney(0, 100.0);
        double transferredAmount = AtmAppFunction.transferMoney(0, 200.0);
        assertEquals(-1, transferredAmount);
        assertEquals(100.0, AtmAppFunction.getAccountBalance(0));
    }

    @Test
    void testChangePin() {
        String result = AtmAppFunction.changePin(0, "4321");
        assertEquals("Pin changed successfully.", result);
        assertEquals("4321", AtmAppFunction.userPins[0]);
    }
}
