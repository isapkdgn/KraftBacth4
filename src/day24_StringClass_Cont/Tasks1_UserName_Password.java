package day24_StringClass_Cont;

import java.util.Scanner;

public class Tasks1_UserName_Password {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a UserName");
        String userName= scan.nextLine();
        System.out.println("Enter a Password");
        String password= scan.nextLine();

        int length=userName.length();
        int length1=password.length();

        if (length>=3&&!(userName.isEmpty())){
            System.out.println("valid username");
        }else {
            System.out.println("username is less than 3 characters and cannot be spaces");

        }
        if (length1>=8&&!(password.isEmpty())){
            System.out.println("valid password");
        }else {
            System.out.println("password is less than 8 characters and cannot be spaces");
        }









    }
}
