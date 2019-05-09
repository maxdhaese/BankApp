package BankApp;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        CheckingAccount checkingAccount = new CheckingAccount(54568, 1000, 1000);
        SavingsAccount savingsAccount = new SavingsAccount(78897,10000);

        User max = new User(5,"Max","Lede","045489498","maxdhaese@gmail.com",checkingAccount,savingsAccount);


        System.out.println("------------------------Welcome to the BankApp-----------------------");
        System.out.println("Which account do you want to use? 1=CheckingAccount, 2=SavingsAccount");
        int choice1 = kbd.nextInt();
        switch (choice1){
            case 1:
                while (true) {
                    System.out.println("\nCheckingAccount id: "+ checkingAccount.getId());
                    menuDisplay();
                    System.out.print("Enter a choice: ");
                    int choice = kbd.nextInt();

                    if (choice == 6) {
                        System.out.println("*Exit*");
                    }


                    checkCheckingAccount(choice,max,checkingAccount);
                }
            case 2:
                while (true) {
                    System.out.println("\nSavingsAccount id: " + savingsAccount.getId() );
                    menuDisplay();
                    System.out.print("Enter a choice: ");
                    int choice = kbd.nextInt();

                    if (choice == 6) {
                        System.out.println("*Exit*");
                    }


                    checkSavingsAccount(choice,max,savingsAccount);
                }

        }

        while (true) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = kbd.nextInt();

            if (choice == 6) {
                System.out.println("*Exit*");

            }



    }

    }

    public static void checkCheckingAccount(int choice, User user, CheckingAccount checkingAccount) {
        Scanner kbd = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.printf("The balance is €%.2f%n",checkingAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                checkingAccount.withdraw(kbd.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                checkingAccount.deposit(kbd.nextDouble());
                break;
            case 4:
                System.out.println("Change the annual rate to:");
                checkingAccount.setAnnualInterestRate(kbd.nextDouble());
                break;
            case 5:
                System.out.println(checkingAccount.toString());
                System.out.println(user.toString());
                break;
            case 6: System.exit(1);
            default:
                break;
        }
    }

    public static void checkSavingsAccount(int choice, User user, SavingsAccount savingsAccount) {
        Scanner kbd = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.printf("The balance is €%.2f%n",savingsAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                savingsAccount.withdraw(kbd.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                savingsAccount.deposit(kbd.nextDouble());
                break;
            case 4:
                System.out.println("Change the annual rate to:");
                savingsAccount.setAnnualInterestRate(kbd.nextDouble());
                break;
            case 5:
                System.out.println(savingsAccount.toString());
                System.out.println(user.toString());
                break;
            case 6: System.exit(1);
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

