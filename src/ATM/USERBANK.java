package ATM;

public class USERBANK {
    private double balance;

    public USERBANK(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("\tsuccessfully deposited you account. \nNew balance: R" + balance);
        }

        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance =balance- amount;
            System.out.println("\tYour Withdrawal was a success.\n New balance: R" + balance);
        }

        else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}
