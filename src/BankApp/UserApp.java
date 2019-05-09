package BankApp;

public class UserApp {
    public static void main(String[] args) {

        Account max = new Account(5,10000);
        CheckingAccount dirk = new CheckingAccount(5,1000,1000);

        dirk.withdraw(500);
        System.out.println(dirk.getBalance());



    }
}
