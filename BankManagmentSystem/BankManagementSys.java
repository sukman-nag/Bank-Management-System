
// abstract class(Abstraction)
abstract class BankManagementSys {
    private String accountholderName;
    private int accountNumber;
    protected double balance;

    // construtor:
    public BankManagementSys(String accountholderName, int accountNumber, double balance) {
        this.accountholderName = accountholderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountholderName;
    }

    public int AccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Common method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: Rs" + amount);
        System.out.println("New balnce:Rs" + balance);
    }

    // Abstract method (Abstraction)
    public abstract void withdraw(double amount);

    public void showDetails() {
        System.out.println("Account holder:" + accountholderName);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Current Balance:" + balance);
    }
}

// Inheritance + Polymorphoism:
class SavingAccount extends BankManagementSys {
    private double interestrate = 0.05;// 5% Interest
    // private String balance;

    public SavingAccount(String accountholderName, int accountNumber, double balance) {
        super(accountholderName, accountNumber, balance);

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance =balance- amount;

            System.out.println("Withdrawn:Rs" + amount);
        } else {
            System.out.println("Insuficient balance ");
        }
        System.out.println(" Remaining Balance = " + balance);
    }

    public void addInterest() {
        double interest = balance * interestrate;
        balance = balance + interest;
        System.out.println("Interest added: Rs" + interest);
    }
}

// ANOTHER INHERITED CLASS:
class CurrentAccount extends BankManagementSys {
    private double overdraftLimit = 10000;

    public CurrentAccount(String accountholderName, int accountNumber, double balance) {
        super(accountholderName, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs" + amount);
        } else {
            System.out.println("Overdraft Limit exceeded:");
        }
        System.out.println("Remaining Balance:Rs" + balance);
    }

}
