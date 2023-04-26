package day40_Encapsulation;

import java.util.Random;
import java.util.Scanner;

public class KraftBank_E {
    private String customerId;
    private String customerFullName;
    private boolean isSms;
    private double customerAccount;
    private String customerToken;

    public KraftBank_E(String customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        setIsSms(isSms);
    }

    public KraftBank_E (String customerId, String customerFullName, boolean isSms, double customerAccount, String customerToken) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        setIsSms(isSms);
        this.customerAccount=customerAccount;
        this.customerToken = customerToken;
    }

    public KraftBank_E addMoney(KraftBank_E kraftbank, double addedmoney) {
        kraftbank.customerAccount += addedmoney;
        return kraftbank;
    }

    public KraftBank_E createToken(KraftBank_E kraftbank) {
        Random rm = new Random();
        kraftbank.customerToken = customerId.concat(customerFullName).substring(0, 2).concat(String.valueOf(rm.nextInt(1000, 9999)));
        return kraftbank;
    }
    public String getCustomerId(){
        return customerId;
    }

    public String getCustomerFullName(){
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName){
        Scanner scan=new Scanner(System.in);
        System.out.print("CustomerFullName değişimi için lütfen CustomerToken giriniz:");
        String NewCustomerToken= scan.nextLine();
        if(!(NewCustomerToken.equals(this.customerToken))){
            System.out.println("Hatalı CustomerToken girdiniz");
            return;
        }
        this.customerFullName=customerFullName;
    }

    public boolean getIsSms(){
        return isSms;
    }

    public void setIsSms(boolean isSms){
        this.isSms=isSms;
    }

    public double getCustomerAccount(){
        return customerAccount;
    }

    public String getCustomerToken(){
        return customerToken;
    }
    public String toString() {
        return "KraftBank_E{" +
                "Customer ID='" + customerId + "', " +
                "Customer Full Name='" + customerFullName + "', " +
                "is Sms='" + isSms + "', " +
                "Customer Account='" + customerAccount + "', " +
                "Customer Token='" + customerToken + "'}";

    }

}
