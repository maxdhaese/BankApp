package BankApp;

public interface BankAccountSpecification {

    void withdraw(double amount);
    void deposit(double amount);

    double getMonthlyInterestRate();
    double getMonthlyInterest();







}
