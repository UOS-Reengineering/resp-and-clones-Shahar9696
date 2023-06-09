package example.project.GodClassExample;

public class BankAccount {

    String owner;
    String accountNumber;
    double balance;
    double interest;

    public BankAccount(String owner, String accountNumber, double balance, double interest) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public double getBalance() {return obtainBalance(); }

    public double obtainBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addInterest() {
        balance = balance + balance*interest;
    }

    public Object getAccountNumber() {
        return accountNumber;
    }
}
