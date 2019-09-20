import memberships.Membership;

import java.util.Date;

public class Customer {
    private Membership membership;
    private String name;
    private String address;
    private double walletBalance;
    private Date dob;

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
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

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void addToWallet(double amount) {
        walletBalance = (walletBalance + amount);
    }

    public void subFromWallet(double amount) throws Exception {
        if (amount > walletBalance) {
            throw new Exception("Insufficient funds");
        }
        walletBalance = walletBalance - amount;
    }


    @Override
    public String toString() {
        return "Customer{" +
                membership.toString() +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", walletBalance=" + walletBalance +
                ", dob=" + dob +
                '}';
    }
}