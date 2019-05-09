package BankApp;

import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        CheckingAccount checkingAccount = new CheckingAccount(5, 1000, 1000);
        SavingsAccount savingsAccount = new SavingsAccount(5,10000);

        User max = new User(5,"Max","Lede","045489498","maxdhaese@gmail.com",checkingAccount,savingsAccount);

        

        while (true) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = kbd.nextInt();

            if (choice == 6) {
                System.out.println("*Exit*");
            }


        performChoice(choice, max,savingsAccount,checkingAccount);
    }

    }

    public static void performChoice(int choice, User user, SavingsAccount savingsAccount, CheckingAccount checkingAccount) {
        Scanner kbd = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.printf("The balance is €%.2f%n",user.getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                user.withdraw(kbd.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                user.deposit(kbd.nextDouble());
                break;
            case 4:
                System.out.println("Change the annual rate to:");
                user.setAnnualInterestRate(kbd.nextDouble());
                break;
            case 5:
                System.out.println(user.toString());

            default:
                break;
        }
    }

    public static void menuDisplay() {
        System.out.printf("%nMain menu%n");
        System.out.println("1: Check balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Change annual rate");
        System.out.println("5: Account");
        System.out.println("6: Exit");
    }
}

