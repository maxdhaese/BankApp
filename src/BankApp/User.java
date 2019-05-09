package BankApp;

public class User extends Account {

    private int id;
    private String name;
    private String Address;
    private String PhoneNr;
    private String eMail;
    CheckingAccount checkingAccount;
    SavingsAccount savingsAccount;

    public User(){

    }

    public User(int id, String name, String address, String phoneNr, String eMail, CheckingAccount checkingAccount, SavingsAccount savingsAccount) {
        this.id = id;
        this.name = name;
        Address = address;
        PhoneNr = phoneNr;
        this.eMail = eMail;
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
    }

    public User(int id, double balance, int id1, String name, String address, String phoneNr, String eMail, CheckingAccount checkingAccount, SavingsAccount savingsAccount) {
        super(id, balance);
        this.id = id1;
        this.name = name;
        Address = address;
        PhoneNr = phoneNr;
        this.eMail = eMail;
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNr() {
        return PhoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        PhoneNr = phoneNr;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNr='" + PhoneNr + '\'' +
                ", eMail='" + eMail + '\'' +
                ", checkingAccount=" + checkingAccount +
                ", savingsAccount=" + savingsAccount +
                '}';
    }
}
