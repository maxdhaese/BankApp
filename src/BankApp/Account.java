package BankApp;

import java.time.LocalDate;

public class Account implements BankAccountSpecification {

    private int id;
    private double balance;

    private static double annualInterestRate;
    private LocalDate dateCreated;


    public Account(){

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
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
    public abstract void withdraw(double withdraw) {

    }

    @Override
    public void deposit(double deposit) {

    }

    @Override
    public double getMonthlyInterestRate() {
        return 0;
    }

    @Override
    public double getMonthlyInterest() {
        return 0;
    }


}
