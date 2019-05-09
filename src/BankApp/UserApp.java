package BankApp;

public class UserApp {
    public static void main(String[] args) {

        Account max = new Account(5,10000);

        max.withdraw(500);
        max.deposit(7000);

        System.out.println(max.getBalance());
    }
}
