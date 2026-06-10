import java.util.Scanner;

// Abstract class
abstract class BankAccount {

    // Encapsulation: Private data members
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    BankAccount(int accountNumber,
                String accountHolderName,
                double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    // Display Details
    public void displayDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Abstract Method
    abstract void calculateInterest();
}

// SavingsAccount Class
class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber,
                   String accountHolderName,
                   double balance) {

        super(accountNumber,
              accountHolderName,
              balance);
    }

    @Override
    void calculateInterest() {

        double interest =
                getBalance() * 0.05; // 5%

        System.out.println(
                "Savings Account Interest: "
                        + interest);
    }
}

// CurrentAccount Class
class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber,
                   String accountHolderName,
                   double balance) {

        super(accountNumber,
              accountHolderName,
              balance);
    }

    @Override
    void calculateInterest() {

        double interest =
                getBalance() * 0.02; // 2%

        System.out.println(
                "Current Account Interest: "
                        + interest);
    }
}

// Main Class
public class Exp10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Savings Account Input
        System.out.println(
                "Enter Savings Account Details");

        System.out.print(
                "Enter Account Number: ");
        int sAccNo = sc.nextInt();
        sc.nextLine();

        System.out.print(
                "Enter Account Holder Name: ");
        String sName = sc.nextLine();

        System.out.print(
                "Enter Initial Balance: ");
        double sBalance = sc.nextDouble();

        SavingsAccount sa =
                new SavingsAccount(
                        sAccNo,
                        sName,
                        sBalance);

        System.out.print(
                "Enter Deposit Amount: ");
        double sDeposit =
                sc.nextDouble();

        sa.deposit(sDeposit);

        // Current Account Input
        System.out.println(
                "\nEnter Current Account Details");

        System.out.print(
                "Enter Account Number: ");
        int cAccNo = sc.nextInt();
        sc.nextLine();

        System.out.print(
                "Enter Account Holder Name: ");
        String cName = sc.nextLine();

        System.out.print(
                "Enter Initial Balance: ");
        double cBalance =
                sc.nextDouble();

        CurrentAccount ca =
                new CurrentAccount(
                        cAccNo,
                        cName,
                        cBalance);

        System.out.print(
                "Enter Deposit Amount: ");
        double cDeposit =
                sc.nextDouble();

        ca.deposit(cDeposit);

        // Display Output
        System.out.println(
                "\n----- Savings Account -----");

        sa.displayDetails();
        sa.calculateInterest();

        System.out.println(
                "\n----- Current Account -----");

        ca.displayDetails();
        ca.calculateInterest();

        sc.close();
    }
}