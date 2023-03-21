package day09_OperatorsCont;

import java.util.Scanner;

public class Tasks02_PhoneNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Country Code");
        int countryCode= scan.nextInt();
        System.out.println("Enter Area Code");
        int areaCode= scan.nextInt();
        System.out.println("Enter Local Number");
        int localNumber= scan.nextInt();

        System.out.println("Your phone number is +("+countryCode+")"+areaCode+"-"+localNumber);
    }
}
