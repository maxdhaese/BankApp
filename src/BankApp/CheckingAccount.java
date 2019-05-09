package BankApp;

public class CheckingAccount extends Account {

    private double overDraftLimit;


    public CheckingAccount() {

    }

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if ((balance + overDraftLimit) >= amount) {
            setBalance(balance - amount);
        }else
            System.out.println("Not enough funds");


    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCheckingAccountId: %d%n\t-Balance: €%.2f%n\t-OverDraftLimit: €%.2f",getId(),getBalance(),overDraftLimit);
    }
}
