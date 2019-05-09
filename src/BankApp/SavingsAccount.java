package BankApp;

public class SavingsAccount extends Account {

    public SavingsAccount(){

    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double withdraw) {
        super.withdraw(withdraw);
    }
}
