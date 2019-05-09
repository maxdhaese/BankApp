package BankApp;

public class CheckingAccount extends Account {

    private double overDraftLimit;



    public CheckingAccount(){

    }

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    public  double getOverDraftLimit() {
        return getOverDraftLimit();
    }

    public  void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return super.toString() + "CheckingAccount{" +
                "overDraftLimit=" + overDraftLimit +
                '}';
    }
}
