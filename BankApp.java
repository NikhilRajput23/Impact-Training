class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal failed. Check amount or balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingAccount extends BankAccount {
    private static final double WITHDRAW_LIMIT = 500;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAW_LIMIT) {
            System.out.println("Withdrawal failed. Limit of $" + WITHDRAW_LIMIT + " exceeded.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Savings Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }
}

class CheckAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 2.50;

    public CheckAccount(double initialBalance) {
        super(initialBalance);
    }

    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;
        if (totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Checking Withdrawn: $" + amount + " (Fee: $" + TRANSACTION_FEE + ")");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance including fee.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(1000);
        CheckAccount ca = new CheckAccount(1000);

        System.out.println("\n-- Savings Account --");
        sa.deposit(200);
        sa.withdraw(600);  
        sa.withdraw(400); 
        sa.displayBalance();

        System.out.println("\n-- Checking Account --");
        ca.deposit(300);
        ca.withdraw(1298);  
        ca.withdraw(100);   
        ca.displayBalance();
    }
}
