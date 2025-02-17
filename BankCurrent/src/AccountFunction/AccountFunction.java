package AccountFunction;

public class AccountFunction {
    private int balance = 0;
    private boolean itExist = true;
    private String pin;
    private String name;

    public AccountFunction(String pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    public boolean itExist() {
        return this.itExist;
    }

    public int deposit(int amount) {
        if (!this.itExist) {
            throw new IllegalStateException("Account does not exist");
        } else if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit negative amount");
        } else {
            this.balance += amount;
            return this.balance;
        }
    }

    public int getBalance() {
        if (!this.itExist) {
            throw new IllegalStateException("Account does not exist");
        } else {
            return this.balance;
        }
    }

    public int withdraw(int amount, String providedPin) {
        if (!this.itExist) {
            throw new IllegalStateException("Account does not exist");
        } else if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw negative amount");
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else if (providedPin != null && providedPin.equals(this.pin)) {
            this.balance -= amount;
            return this.balance;
        } else {
            throw new IllegalArgumentException("Invalid PIN");
        }
    }

    public boolean doesNotExist() {
        this.itExist = false;
        return false;
    }

    public boolean updatePin(String pin, String newPin) {
        if (!pin.equals(this.pin)) {
            throw new IllegalArgumentException("Invalid PIN");
        } else {
            this.pin = newPin;
            return true;
        }
    }
}