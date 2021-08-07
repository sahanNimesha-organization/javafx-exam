package model;

public class Customer {
    private int cust_ID;
    private String name;
    private String address;

    public Customer(int cust_ID, String name, String address) {
        this.cust_ID = cust_ID;
        this.name = name;
        this.address = address;
    }

    public Customer() {
    }

    public int getCust_ID() {
        return cust_ID;
    }

    public void setCust_ID(int cust_ID) {
        this.cust_ID = cust_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_ID=" + cust_ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
