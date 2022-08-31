package case_study.models;

public class Customer extends Person {
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String typeOfCustomer, String address) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(int id, String name, String dateOfBirth, String sex, String nationalId, String phoneNumber, String email, String typeOfCustomer, String address) {
        super(id, name, dateOfBirth, sex, nationalId, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
