package BankApp;

public class User extends Account {

    private int id;
    private String name;
    private String Address;
    private String PhoneNr;
    private String eMail;

    public User(){

    }

    public User(int id, String name, String address, String phoneNr, String eMail) {
        this.id = id;
        this.name = name;
        Address = address;
        PhoneNr = phoneNr;
        this.eMail = eMail;
    }

    public User(int id, double balance, String name, String address, String phoneNr, String eMail) {
        super(id, balance);
        this.name = name;
        Address = address;
        PhoneNr = phoneNr;
        this.eMail = eMail;

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


}
