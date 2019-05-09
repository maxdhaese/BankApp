package BankApp;

public class SavingsAccount extends Account {


    public SavingsAccount() {


    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if (balance > amount) {
            setBalance(balance - amount);


        } else
            System.out.println("Not enough funds");

    }
}
