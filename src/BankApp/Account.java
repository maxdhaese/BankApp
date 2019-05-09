package BankApp;

import java.time.LocalDate;

public class Account implements BankAccountSpecification {

    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 2.50;
    private LocalDate dateCreated;


    public Account(){
        this.dateCreated = LocalDate.now();

    }

    public Account(int id, double balance) {
        this.dateCreated = LocalDate.now();
        this.id = id;
        this.balance = balance;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }


    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;

    }

    @Override
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    @Override
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() ;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
