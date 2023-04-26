package day39_ConstructorOverloading;

import java.util.Random;

public class KraftBank {
    public String customerId;
    public String customerFullName;
    public boolean isSms;
    public double customerAccount;
    public String customerToken;

    public KraftBank(String customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
    }

    public KraftBank(String customerId, String customerFullName, boolean isSms, double customerAccount) {
        this(customerId, customerFullName, isSms);
        this.customerAccount = customerAccount;
    }

    public KraftBank(String customerId, String customerFullName, boolean isSms, double customerAccount, String customerToken) {
        this(customerId, customerFullName, isSms, customerAccount);
        this.customerToken = customerToken;
    }

    public KraftBank addMoney(KraftBank kraftbank, double addedmoney) {
        kraftbank.customerAccount += addedmoney;
        return kraftbank;
    }

    public KraftBank createToken(KraftBank kraftbank) {
        Random rm=new Random();
        kraftbank.customerToken= customerId.concat(customerFullName).substring(0, 2).concat(String.valueOf(rm.nextInt(1000,9999)));
        return kraftbank;
    }

    public String toString() {
        return "KraftBank{" +
                "Customer ID='" + customerId + "', " +
                "Customer Full Name='" + customerFullName + "', " +
                "is Sms='" + isSms + "', " +
                "Customer Account='" + customerAccount + "', " +
                "Customer Token='" + customerToken + "'}";

    }
}
